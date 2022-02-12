
package classes;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public interface IOrder {
    public ArrayList<Song> orderSongAsc(ArrayList<Song> list, String criterion);
    
    public ArrayList<Song> orderSongDesc(ArrayList<Song> list, String criterion);
    
}
