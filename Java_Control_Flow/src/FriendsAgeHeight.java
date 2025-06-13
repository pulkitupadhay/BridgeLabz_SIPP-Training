import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + names[i] + "'s height: ");
            heights[i] = sc.nextDouble();
        }
        int youngestAge = ages[0];
        for (int i = 1; i < 3; i++) if (ages[i] < youngestAge) youngestAge = ages[i];
        double tallestHeight = heights[0];
        for (int i = 1; i < 3; i++) if (heights[i] > tallestHeight) tallestHeight = heights[i];
        System.out.println("The youngest friend is " + youngestAge + " years old.");
        System.out.println("The tallest friend is " + tallestHeight + " cm tall.");
    }
}
