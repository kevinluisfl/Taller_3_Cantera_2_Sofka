/**
 * Se importa el paquete y librerias a usar.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Representa la clase Filter con implementación de la interfaz IFilter.
 * @authores kevin y Juan David.
 */
public class Filter implements IFilter {
    ArrayList<Song> libraryFilter = new ArrayList<>();
    
    SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");

    /**
     * Hereda el metodo FilterYear de la interfaz IFilter.
     * @param list
     * @param year
     * @return ArrayList del metodo FilterYear.
     */
    @Override
    public ArrayList<Song> FilterYear(ArrayList<Song> list, int year) {
/**
 * Representa un metodo para filtrar las canciones por año.
 */
        for (Song item: list) {
            int yearSong = Integer.parseInt (getYearFormat.format(item.getDate()));
            if (yearSong == year) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }

    /**
     * Hereda el metodo FilterGenre de la interfaz IFilter.
     * @param list
     * @param genre
     * @return ArrayList del metodo FilterGenre
     */
    @Override
    public ArrayList<Song> FilterGenre(ArrayList<Song> list, String genre) {
/**
 * Representa el metodo para filtrar canciones por genero.
 */
        for (Song item: list) {
            if (item.getGenre() == genre) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }
}
