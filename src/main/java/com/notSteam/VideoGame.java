package com.notSteam;

import java.util.List;

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

    public void setPrice (double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        } else {
            this.price = price;
        }
    }

    public double applyDiscount (double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        } else {
            return price - (price * percentage / 100);
        }
    }

    public double calculateFinalPrice(List <Double> discounts, double taxPercentage) {
        double finalPrice = price;

        for (double discount : discounts) {
            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
            }
            finalPrice -= finalPrice * (discount / 100);
        }

        if (taxPercentage < 0 || taxPercentage > 100) {
            throw new IllegalArgumentException("Tax percentage must be between 0 and 100");
        }

        finalPrice += finalPrice * (taxPercentage / 100);
        return finalPrice;
    }


    public boolean isRatingGreaterThanAnother(VideoGame other) {
        return this.rating > other.rating;
    }

}