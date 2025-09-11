import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;
    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    public String getTitle() { return title; }
    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }
    public String toString() { return title + " (" + rating + ", " + releaseYear + ")"; }
}

public class Q1_Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2024),
            new Movie("Movie B", 9.0, 2025),
            new Movie("Movie C", 7.8, 2023),
            new Movie("Movie D", 8.9, 2025),
            new Movie("Movie E", 8.7, 2024),
            new Movie("Movie F", 9.2, 2025),
            new Movie("Movie G", 8.1, 2022)
        );
        List<Movie> top5 = movies.stream()
            .filter(m -> m.getRating() >= 8.0)
            .sorted(Comparator.comparing(Movie::getRating).reversed()
                .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
            .limit(5)
            .collect(Collectors.toList());
        top5.forEach(System.out::println);
    }
}

