package Day_3;

import java.util.*;

//Custom Exception for invalid time format
class InvalidTimeFormatException extends Exception {
 public InvalidTimeFormatException(String message) {
     super(message);
 }
}

public class CinemaTime {
 static List<String> movieTitles = new ArrayList<>();
 static List<String> showTimes = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
     int choice;

     do {
         System.out.println("\n--- CinemaTime: Movie Schedule Manager ---");
         System.out.println("1. Add Movie");
         System.out.println("2. Search Movie");
         System.out.println("3. Display All Movies");
         System.out.println("4. Generate Movie Report (as array)");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();
         sc.nextLine(); // clear buffer

         switch (choice) {
             case 1:
                 try {
                     System.out.print("Enter movie title: ");
                     String title = sc.nextLine();
                     System.out.print("Enter showtime (HH:MM): ");
                     String time = sc.nextLine();
                     addMovie(title, time);
                 } catch (InvalidTimeFormatException e) {
                     System.out.println("Error: " + e.getMessage());
                 }
                 break;

             case 2:
                 System.out.print("Enter keyword to search: ");
                 String keyword = sc.nextLine();
                 searchMovie(keyword);
                 break;

             case 3:
                 displayAllMovies();
                 break;

             case 4:
                 generateReport();
                 break;

             case 5:
                 System.out.println("Exiting CinemaTime. Thank you!");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }

     } while (choice != 5);
 }

 public static void addMovie(String title, String time) throws InvalidTimeFormatException {
     if (!isValidTimeFormat(time)) {
         throw new InvalidTimeFormatException("Invalid time format. Use HH:MM format (00–23:00–59).");
     }
     movieTitles.add(title);
     showTimes.add(time);
     System.out.println("Movie added successfully!");
 }

 public static boolean isValidTimeFormat(String time) {
     try {
         String[] parts = time.split(":");
         if (parts.length != 2) return false;
         int hour = Integer.parseInt(parts[0]);
         int minute = Integer.parseInt(parts[1]);
         return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
     } catch (NumberFormatException e) {
         return false;
     }
 }

 public static void searchMovie(String keyword) {
     boolean found = false;
     System.out.println("\nSearch Results:");
     for (int i = 0; i < movieTitles.size(); i++) {
         if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
             System.out.printf("Movie %d: %s at %s\n", i + 1, movieTitles.get(i), showTimes.get(i));
             found = true;
         }
     }
     if (!found) {
         System.out.println("No movies found with the keyword \"" + keyword + "\".");
     }
 }

 public static void displayAllMovies() {
     if (movieTitles.isEmpty()) {
         System.out.println("No movies to display.");
         return;
     }

     System.out.println("\nAll Scheduled Movies:");
     for (int i = 0; i < movieTitles.size(); i++) {
         System.out.println(String.format("Movie %d: %s at %s", i + 1, movieTitles.get(i), showTimes.get(i)));
     }
 }

 public static void generateReport() {
     String[] report = new String[movieTitles.size()];
     for (int i = 0; i < movieTitles.size(); i++) {
         report[i] = String.format("%s at %s", movieTitles.get(i), showTimes.get(i));
     }

     System.out.println("\n--- Movie Report (Array) ---");
     for (String entry : report) {
         System.out.println(entry);
     }
 }
}
