package com.notSteam;

public class VideoGame {

    private String title;
    private String genre;
    private int rating;
    private double price;

    public VideoGame(String title, String genre, int rating, double price) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating (int rating) {
        if (rating <0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        } else {
            this.rating = rating;
        }
    }

    public double getPrice() {
        return price;
    }

    public boolean isRatingGreaterThanAnother(VideoGame other) {
        return this.rating > other.rating;
    }
}