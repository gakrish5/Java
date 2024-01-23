package ObjectArrays.Movie;

import java.util.*;

public class MovieSortingExample {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        // Adding movies to the list
        movieList.add(new Movie(2000, 8.5, 50.0, 120.0));
        movieList.add(new Movie(2010, 7.8, 80.0, 150.0));
        movieList.add(new Movie(2005, 8.0, 60.0, 130.0));

        // Sorting the list of movies based on rating and profit
        Collections.sort(movieList, new RatingAndProfitComparator());

        // Displaying the sorted list
        System.out.println("Sorted Movies based on Rating and Profit:");
        for (Movie movie : movieList) {
            System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating() +
                    " - Profit: " + (movie.getCollectionAmount() - movie.getBudget()));
        }

        // Sorting the list of movies based on yearReleased and rating
        Collections.sort(movieList, new YearAndRatingComparator());

        // Displaying the sorted list
        System.out.println("\nSorted Movies based on Year and Rating:");
        for (Movie movie : movieList) {
            System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating());
        }
    }
}