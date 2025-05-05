package com.example.pracs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<String> songs = new ArrayList<>();
    private Random rnd = new Random();

    // Add a song title
    public void addSong(String title) {
        songs.add(title);
    }

    // Remove a song by title
    public boolean removeSong(String title) {
        return songs.remove(title);
    }

    // Play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
            return;
        }
        int idx = rnd.nextInt(songs.size());
        System.out.println("Now playing: " + songs.get(idx));
    }

    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        lib.addSong("Bohemian Rhapsody");
        lib.addSong("Hotel California");
        lib.addSong("Stairway to Heaven");

        lib.playRandomSong();
        lib.removeSong("Hotel California");
        lib.playRandomSong();
    }
}