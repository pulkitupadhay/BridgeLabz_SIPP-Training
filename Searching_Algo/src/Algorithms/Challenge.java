package Algorithms;

import java.io.*;

public class Challenge {
    public static void main(String[] args) throws IOException {
       
        int n = 1000000;
        String str = "hello";

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(str);
        long sbTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) sf.append(str);
        long sfTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + sbTime);
        System.out.println("StringBuffer time: " + sfTime);

        
        BufferedReader fr = new BufferedReader(new FileReader("largefile.txt"));
        int words1 = 0;
        String line;
        while ((line = fr.readLine()) != null) {
            words1 += line.split("\\s+").length;
        }
        fr.close();

        BufferedReader ir = new BufferedReader(
            new InputStreamReader(new FileInputStream("largefile.txt"), "UTF-8")
        );
        int words2 = 0;
        while ((line = ir.readLine()) != null) {
            words2 += line.split("\\s+").length;
        }
        ir.close();

        System.out.println("Words with FileReader: " + words1);
        System.out.println("Words with InputStreamReader: " + words2);
    }
}
