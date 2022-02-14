/**
 * Se importa el paquete classes y la libreria ArrayList.
 */
package classes;

import java.util.ArrayList;

/**
 *Representa la interfaz IFilter.
 * @author kevinf y Juan David.
 */
public interface IFilter {
    /**
     *
     * @param list de tipo ArratList.
     * @param year de tipo int.
     * @return
     */
    public ArrayList<Song> FilterYear(ArrayList<Song> list, int year);

    public ArrayList<Song> FilterGenre(ArrayList<Song> list, String genre);
}
