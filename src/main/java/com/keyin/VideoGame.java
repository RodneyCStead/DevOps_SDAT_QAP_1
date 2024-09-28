package com.keyin;

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

    public double getPrice() {
        return price;
    }

}