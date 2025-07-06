package com.khanhduzz.imagefx;

import java.io.File;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        File input = new File("src/test/resources/sample.png");
        File output = new File("src/test/resources/inverted.png");

        ImageInverter.invertImageColors(input, output);
        System.out.println("Inverted image saved to: " + output.getAbsolutePath());
    }
}
