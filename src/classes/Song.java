import java.util.Date;

public class Song {
    private String title;
    private int identifier;
    private Date date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    public Song() {

    }

    public Song(String title, int identifier, Date date, int duration, String genre, String cover, String description) {
        this.title = title;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }


    public Song(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
