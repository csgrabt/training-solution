package week05d05.senior;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private final List<Song> songs;

    public PlayList(List<Song> songs) {
        this.songs = new ArrayList<>(songs);
    }

    public List<Song> getSongs() {
        ArrayList<Song> copy = new ArrayList<>();
        for (Song item : songs
        ) {
            copy.add(new Song(item));
        }
        return copy;
    }

    public void addToList(Song song) {
        songs.add(song);
    }


    public List<Song> findByLengthGreaterThan(int min) {
        List<Song> longerThanMin = new ArrayList<>();

        for (Song item : songs
        ) {
            if (secToMin(item) > min) {
                longerThanMin.add(item);
            }
        }
        listSizeIsZero(longerThanMin);
        return longerThanMin;
    }

    private void listSizeIsZero(List<Song> longerThanMin) {
        if (longerThanMin.isEmpty()) {
            throw new IllegalArgumentException("Do not have match!");
        }
    }


    private double secToMin(Song song) {
        return (double) song.getLengthInSeconds() / 60;
    }


    public String listToString() {
        StringBuilder sb = new StringBuilder();
        for (Song item : getSongs()
        ) {
            sb.append(item.toString());

        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return listToString();
    }
}




