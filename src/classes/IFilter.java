
package classes;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public interface IFilter {
    public ArrayList<Song> FilterYear(ArrayList<Song> list, int y);

    public ArrayList<Song> FilterGenre(ArrayList<Song> list, String g);
}
