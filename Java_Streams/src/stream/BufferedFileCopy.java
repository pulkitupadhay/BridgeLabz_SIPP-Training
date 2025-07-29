package stream;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"))) {

            byte[] buffer = new byte[4096];
            int length;
            while ((length = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, length);
            }

        }

        long end = System.nanoTime();
        System.out.println("Buffered copy time (ns): " + (end - start));
    }
}
