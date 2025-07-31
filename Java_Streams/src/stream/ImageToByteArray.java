package stream;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int b;
        while ((b = fis.read()) != -1) {
            baos.write(b);
        }
        fis.close();

        byte[] imageBytes = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("output.jpg");

        while ((b = bais.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        System.out.println("Image copied using byte array.");
    }
}
