package svd;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularValueDecomposition;

import java.awt.image.BufferedImage;

public class ConcurrentSVDCompressor implements SVDImageCompressor {
    public ConcurrentSVDCompressor() {}

    public BufferedImage compress(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();

        int k = Math.min(img.getWidth(), img.getHeight()) / 10; // e.g., 50 for 500x500

        double[][] matrix = new double[height][width];

        // Convert image to matrix
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = img.getRGB(x, y);
                int gray = rgb & 0xFF;  // Grayscale value
                matrix[y][x] = gray;
            }
        }

        RealMatrix original = MatrixUtils.createRealMatrix(matrix);
        SingularValueDecomposition svd = new SingularValueDecomposition(original);

        RealMatrix U = svd.getU();
        RealMatrix S = svd.getS();
        RealMatrix V = svd.getV();

        // Reduce to rank-k approximation
        RealMatrix Uk = U.getSubMatrix(0, height - 1, 0, k - 1);
        RealMatrix Sk = S.getSubMatrix(0, k - 1, 0, k - 1);
        RealMatrix Vk = V.getSubMatrix(0, width - 1, 0, k - 1);

        RealMatrix approximation = Uk.multiply(Sk).multiply(Vk.transpose());

        // Convert matrix back to image
        BufferedImage compressedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        // Set up threading
        int numThreads = Math.min(height, Runtime.getRuntime().availableProcessors());
        Thread[] threads = new Thread[numThreads];

        int rowsPerThread = height / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int startRow = threadIndex * rowsPerThread;
                int endRow = (threadIndex == numThreads - 1) ? height : startRow + rowsPerThread;

                for (int y = startRow; y < endRow; y++) {
                    for (int x = 0; x < width; x++) {
                        int value = (int) Math.round(approximation.getEntry(y, x));
                        value = Math.max(0, Math.min(255, value)); // Clamp
                        int rgb = (value << 16) | (value << 8) | value;
                        compressedImage.setRGB(x, y, rgb);
                    }
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return compressedImage;
    }
}

