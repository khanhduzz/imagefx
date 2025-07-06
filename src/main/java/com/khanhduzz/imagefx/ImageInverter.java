package com.khanhduzz.imagefx;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageInverter {
    /**
     * Inverts the colors of the image at the input path and saves to output path.
     * @param input  Input image file (PNG or JPG)
     * @param output Output file where the inverted image is saved
     * @throws IOException if read/write fails
     */
    public static void invertImageColors(File input, File output) throws IOException {
        BufferedImage image = ImageIO.read(input);

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int rgba = image.getRGB(x, y);
                Color original = new Color(rgba, true);
                Color inverted = new Color(
                        255 - original.getRed(),
                        255 - original.getGreen(),
                        255 - original.getBlue()
                );
                image.setRGB(x, y, inverted.getRGB());
            }
        }

        ImageIO.write(image, "png", output);
    }
}