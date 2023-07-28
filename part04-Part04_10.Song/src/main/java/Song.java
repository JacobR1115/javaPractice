public class Song {

    private String name;

    // length is in seconds
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
