package week05d05.senior;

public class Song {
    private final String name;
    private final long lengthInSeconds;
    private final String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        validatorString(name);
        validatorString(artist);
        lengthValidator(lengthInSeconds);
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    public Song(Song song) {
        name = song.getName();
        lengthInSeconds = song.getLengthInSeconds();
        artist = song.getArtist();
    }


    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    private void validatorString(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Name/Artist is empty or null!");
        }

    }

    private void lengthValidator(long lengthInSeconds) {
        if (lengthInSeconds <= 0) {
            throw new IllegalArgumentException("Length is not valid!");
        }
    }

    @Override
    public String toString() {
        return "Title: " + name + ", Length: " + lengthInSeconds + " sec, Artist: " + artist + ";\n";
    }
}
