
package main;

import classes.Song;
import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class CreatePlayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Song> library = new ArrayList<>();
        Song s1 = new Song();
        Song s2 = new Song();
        Song s3 = new Song();
        Song s4 = new Song();
        
        library.add(s1);
        library.add(s2);
        library.add(s3);
        library.add(s4);
        
    }
    
}
