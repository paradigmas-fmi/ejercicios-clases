package svd;

import org.apache.commons.math3.linear.*;
import java.awt.image.BufferedImage;

public class SimpleSVDCompressor implements SVDImageCompressor {
    public SimpleSVDCompressor() {}

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
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int value = (int) Math.round(approximation.getEntry(y, x));
                value = Math.min(255, Math.max(0, value)); // Clamp
                int rgb = (value << 16) | (value << 8) | value;
                compressedImage.setRGB(x, y, rgb);
            }
        }
        return compressedImage;
    }
}

