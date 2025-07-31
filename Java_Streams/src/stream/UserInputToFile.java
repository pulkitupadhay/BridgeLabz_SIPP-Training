package stream;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user_data.txt")) {

            System.out.print("Name: ");
            String name = br.readLine();
            System.out.print("Age: ");
            String age = br.readLine();
            System.out.print("Favorite Language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
