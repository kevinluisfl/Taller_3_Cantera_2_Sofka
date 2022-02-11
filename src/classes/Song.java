package classes;

import java.util.Date;

public class Song implements Comparable<Song> {
    private String title;
    private int identifier;
    private Date date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    public Song() {

    }

    public Song(String title, Date date, int duration, String genre) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.duration = duration;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Titulo='" + title + '\'' +
                ", Identificador=" + identifier +
                ", Fecha=" + date +
                ", Duración=" + duration +
                ", Genero='" + genre + '\'' +
                ", Caratula='" + cover + '\'' +
                ", Descripción='" + description;
    }

    @Override
    public int compareTo(Song o) {
        return date.compareTo(o.getDate());
    }
}
