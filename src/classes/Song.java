/**
 * Se importa el paquete classes y la libreria Date.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representa la clase Song
 *
 * esta clase contiene las caracteristicas de creación de las canciones ej.:
 *
 * Song song = new Song(title, identifier, date, duration, genre, cover,
 * description); song.getTitle();
 *
 * @version 1.00.000 2022-02-14, La clase corresponde a la versión 1 del
 * sistema, la misma no a sufrido refactorings durante la versión no se
 * realizaron cambios menores el último cambio fue realizado el 14 de febrero de
 * 2022
 *
 * @author Kevin Luis Flórez y Juan David Restrepo
 *
 * @since 1.00.000
 *
 */
public class Song {

    /**
     * atributos de la clase Song
     */
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
     *
     * @param title tipo String
     * @param date tipo Date
     * @param duration tipo int
     * @param genre tipo String
     */
    public Song(String title, Date date, int duration, String genre) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.duration = duration;
    }

    /**
     * constructor sobrecargado con todos los atributos
     *
     * @param title tipo String
     * @param identifier tipo int
     * @param date tipo Date
     * @param duration tipo int
     * @param genre tipo String
     * @param cover tipo String
     * @param description tipo String
     */
    public Song(String title, int identifier, Date date, int duration, 
                String genre, String cover, String description) {
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
     *
     * @return titulo de la canción tipo String.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Representa el metodo setTitles.
     *
     * @param title de tipo String.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Representa el metodo getIdentifier.
     *
     * @return identificador de la canción tipo int.
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * Representa el metodo setIdentifier.
     *
     * @param identifier de tipo int.
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * Rerpesenta el metodo getDate.
     *
     * @return la fecha de la canción tipo Date.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Representa el metodo setDate.
     *
     * @param date de tipo Date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Representa el metodo getDuration.
     *
     * @return duraciión de la canción tipo int.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Representa el metodo setDuration.
     *
     * @param duration de tipo int.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Representa el metodo setGenre.
     *
     * @return genero de la canción tipo String.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Representa el metodo setGenre.
     *
     * @param genre de tipo String.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Representa el metodo getCover
     *
     * @return url caratula de la canción tipo String.
     */
    public String getCover() {
        return cover;
    }

    /**
     * Representa el metodo cover.
     *
     * @param cover de tipo String.
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Representa el metodo getDescription.
     *
     * @return descripción de la canción tipo String.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Representa el metodo setDescription.
     *
     * @param description parametro tipo String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Representa el metodo getMillis. este método se usa para comparar dos
     * fechas, obteniendo el tiempo transcurrido en milisegundos
     *
     * @return valor de this.date en milisegundos tipo long
     * @author Kevin Luis Flórez y Juan David Restrepo
     *
     * @since 1.00.000
     */
    public long getMillis() {
        return this.date.getTime();
    }

    /**
     * Método para formatear la fecha de la canción a un String más legible
     *
     * @return la fecha de canción formateada tipo String
     * @author Kevin Luis Flórez y Juan David Restrepo
     *
     * @since 1.00.000
     */
    public String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.date);
        return dateFormat;
    }

    /**
     * toString para visualizar la información de cada instancia
     *
     * @return title, identifier, date, duration, genre, cover, description
     */
    @Override
    public String toString() {
        return "Titulo='" + this.getTitle() + '\''
                + ", Identificador=" + this.getIdentifier()
                + ", Fecha=" + this.formatDate()
                + ", Duración=" + this.getDuration()
                + ", Genero='" + this.getGenre() + '\''
                + ", Caratula='" + this.getCover() + '\''
                + ", Descripción='" + this.getDescription() + "\n";
    }

}
