/**
 * Se importa el paquete classes y la libreria ArrayList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la interfaz IOrder.
 * @author kevinf y Juan David.
 */
public interface IOrder {
    /**
     *
     * @param list de tipo ArrayList.
     * @param criterion de tipo String.
     * @return
     */
    public ArrayList<Song> orderSongAsc(ArrayList<Song> list, String criterion);
    
    public ArrayList<Song> orderSongDesc(ArrayList<Song> list, String criterion);
    
}
