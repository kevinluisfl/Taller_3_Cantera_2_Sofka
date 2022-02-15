/**
 * Se importa el paquete y librerias SimpleDateFormat, ArrayList.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Representa la clase Filter con implementación de la interfaz IFilter.
 *
 * esta clase contiene los métodos implementados para filtrar las canciones ej.:
 *
 * Filter filter = new Filter(); filter.filterYear(list, year);
 *
 * list es el array a filtrar, year es el valor que define por cual
 * atributo se va filtrar, en este caso el año.
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
public class Filter implements IFilter {

    /**
     * el arraylist libraryFilter almacena el arraylist filtrado
     */
    ArrayList<Song> libraryFilter = new ArrayList<>();

    SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");

    /**
     * Se implementa el siguiente método filterYear de la interfaz IFilter para
     * filtrar la libreria por año.
     *
     * @param list de tipo ArrayList.
     * @param year de tipo int.
     * @return un ArrayList del método FilterYear.
     */
    @Override       
    public ArrayList<Song> filterYear(ArrayList<Song> list, int year) {
        for (Song item : list) {
            int yearSong = Integer.parseInt(getYearFormat.format(item.getDate()));
            if (yearSong == year) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }

    /**
     * Se implementa el siguiente método filterGenre de la interfaz IFilter para
     * filtrar la libreria por género.
     *
     * @param list de tipo ArrayList.
     * @param genre de tipo String.
     * @return ArrayList del método FilterGenre
     */
    @Override
    public ArrayList<Song> filterGenre(ArrayList<Song> list, String genre) {
        for (Song item : list) {
            if (item.getGenre() == genre) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }
}
