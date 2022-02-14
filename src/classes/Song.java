/**
 * Se importa el paquete classes y la libreria Date.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representa la clase Song.
 * @authores Kevin y Juan David.
 */
public class Song {
    private String title;
    private Integer identifier;
    private Date date;
    private Integer duration;
    private String genre;
    private String cover;
    private String description;

    public Song() {

    }

    /**
     * Representa el constructor de la clase Song.
     * @param title
     * @param date
     * @param duration
     * @param genre
     */
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

    /**
     * Representa el metodo getTitle.
     * @return titulo de la canción.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Representa el metodo setTitles.
     * @param title de tipo String.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Representa el metodo getIdentifier.
     * @return identificador de la canción.
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Representa el metodo setIdentifier.
     * @param identifier de tipo int.
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * Rerpesenta el metodo getDate.
     * @return la fecha de la canción.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Representa el metodo setDate.
     * @param date de tipo Date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Representa el metodo getDuration.
     * @return duraciión de la canción.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Representa el metodo setDuration.
     * @param duration de tipo int.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Representa el metodo setGenre.
     * @return genero de la canción.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Representa el metodo setGenre.
     * @param genre de tipo String.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Representa el metodo getCover
     * @return caratula de la canción en tipo texto.
     */
    public String getCover() {
        return cover;
    }

    /**
     * Representa el metodo cover.
     * @param cover de tipo String.
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Representa el metodo getDescription.
     * @return descripción de la canción.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Representa el metodo setDescription.
     * @param description parametro tipo String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Representa el metodo getMillis.
     * @return this.date.getTime valor en milisegundos tipo long
     */
    public long getMillis(){
       return this.date.getTime();
    }
    
    /**
     * Método para formatear la fecha de la canción a un String más legible
     * @return la fecha de canción formateada tipo String
     */
    public String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.date);
        return dateFormat;
    }

    /**
     * Hereda atributos de la clase Song.
     * @return title, identifier, date, duration, genre, cover, description
     */
    @Override
    public String toString() {
        return "Titulo='" + getTitle() + '\'' +
                ", Identificador=" + getIdentifier() +
                ", Fecha=" + formatDate() +
                ", Duración=" + getDuration() +
                ", Genero='" + getGenre() + '\'' +
                ", Caratula='" + getCover() + '\'' +
                ", Descripción='" + getDescription();
    }

}
