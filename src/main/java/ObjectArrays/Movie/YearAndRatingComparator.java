package ObjectArrays.Movie;

import java.util.*;

class YearAndRatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        // Compare movies based on yearReleased first
        int yearComparison = Integer.compare(movie1.getYearReleased(), movie2.getYearReleased());

        // If yearReleased is the same, compare based on rating
        if (yearComparison == 0) {
            return Double.compare(movie1.getRating(), movie2.getRating());
        }

        return yearComparison;
    }
}
