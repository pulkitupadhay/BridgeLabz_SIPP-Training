package Algorithms;

import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream("input.txt"), "UTF-8")
        );
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
