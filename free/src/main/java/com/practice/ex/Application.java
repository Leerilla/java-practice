package com.practice.ex;

public class Application {

    public static void main(String[] args) {

        MovieReview jesus = new MovieReview();
        jesus.movieTitle = "Jesus";
        jesus.movieReview = "The story of the Son of God's love for humanity.";

        MovieReview darkKnight = new MovieReview();
        darkKnight.movieTitle = "Dark Knight";
        darkKnight.movieReview = "He has a hero who chose to be trapped in the darkness to protect the city's hope.";

        System.out.println("영화 제목 : " + jesus.movieTitle + ", 영화 리뷰 : " + jesus.movieReview);
        System.out.println("영화 제목 : " + darkKnight.movieTitle + ", 영화 리뷰 : " + darkKnight.movieReview);


    }
}
