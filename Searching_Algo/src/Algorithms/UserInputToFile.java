package Algorithms;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String input;
        System.out.println("Enter text (type 'exit' to finish):");
        while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
            writer.write(input);
            writer.newLine();
        }
        writer.close();
    }
}
