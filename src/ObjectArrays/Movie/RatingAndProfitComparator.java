package ObjectArrays.Movie;

import java.util.*;

class RatingAndProfitComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        // Compare movies based on rating first
        int ratingComparison = Double.compare(movie1.getRating(), movie2.getRating());

        // If rating is the same, compare based on profit (collectionAmount - budget)
        if (ratingComparison == 0) {
            double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
            double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
            return Double.compare(profit1, profit2);
        }

        return ratingComparison;
    }
}
