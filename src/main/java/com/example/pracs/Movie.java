package com.example.pracs;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<String> actors = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        if (actors != null) {
            this.actors.addAll(actors);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return new ArrayList<>(actors);
    }

    // Add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Retrieve all reviews
    public List<String> getReviews() {
        return new ArrayList<>(reviews);
    }

    @Override
    public String toString() {
        return String.format("%s (dir. %s) starring %s",
                title, director, String.join(", ", actors));
    }

    // Demo
    public static void main(String[] args) {
        List<String> cast = List.of("Alice", "Bob", "Charlie");
        Movie m = new Movie("The Great Adventure", "Jane Doe", cast);

        System.out.println(m);
        m.addReview("Amazing visuals!");
        m.addReview("Compelling story.");

        System.out.println("Reviews:");
        for (String r : m.getReviews()) {
            System.out.println("- " + r);
        }
    }
}
