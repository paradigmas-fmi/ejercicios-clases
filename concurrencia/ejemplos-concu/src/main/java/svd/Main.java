package svd;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> inputImages = List.of("cat.jpg", "monalisa.jpg");

        long startTime = System.nanoTime();

        for (int i=0; i<inputImages.size(); i++) {
            String inputImagePath = inputImages.get(i);
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(inputImagePath);
            if (inputStream == null) {
                throw new IllegalArgumentException("Image not found in resources folder");
            }

            BufferedImage img = ImageIO.read(inputStream);

            SVDImageCompressor compressor = new ConcurrentSVDCompressor();
            BufferedImage compressedImage = compressor.compress(img);

            String outputImagePath = String.format("output-%s", inputImagePath);
            ImageIO.write(compressedImage, "jpg", new File(outputImagePath));
            System.out.println("SVD compression complete. Output saved to " + outputImagePath);

        }

        long endTime = System.nanoTime();
        double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Execution time: %.3f seconds%n", elapsedTimeInSeconds);
    }
}
