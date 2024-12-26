package org.example.class1;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();

        movieReview1.review = "goood";
        movieReview1.title = "movie review title 1";

        movieReview2.review = "bad";
        movieReview2.title = "movie review title 2";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("name: " + movieReview.title + "review: " + movieReview.review);
        }




    }
}
