
package main;

import classes.PlayList;
import classes.Song;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JOptionPane;


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
        try {

            String title, genre, cover, description, namePlayList;
            int identifier, year, month, day, duration, limit = 0;

            ArrayList<Song> songs = new ArrayList<>();

            ArrayList<Song> library = new ArrayList<>();
            Song s1 = new Song("cancion 1", 1, new Date(2002 - 1900, 4 - 1, 12), 180, "Rock", "cover1.png", "descripción 1" + "\n");
            Song s2 = new Song("cancion 2", 2, new Date(85, 2, 21), 200, "Pop", "cover2.png", "descripción 2" + "\n");
            Song s3 = new Song("cancion 3", 3, new Date(103, 7, 24), 150, "Vallenato", "cover3.png", "descripción 3" + "\n");
            Song s4 = new Song("cancion 4", 4, new Date(1989, 10, 10), 230, "Cumbia", "cover4.png", "descripción 4" + "\n");
            Song s5 = new Song("cancion 5", 5, new Date(115, 6, 8), 210, "Hip-Hop", "cover5.png", "descripción 5" + "\n");
            library.add(s1);
            library.add(s2);
            library.add(s3);
            library.add(s4);
            library.add(s5);


//            library.forEach(s ->{
//                System.out.println("Nombre: "+s.getTitle()+" -Genero: "+s.getGenre()+" -Fecha: "+s.getDate());
//            });

            while (limit == 0) {
                int selection = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Menu",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Crear canción", "Crear playlist", "Ver biblioteca", "Cerrar"}, "opcion 1");


                switch (selection + 1) {
                    case 1:

                        ////////ATRIBUTOS DE CANCION
                        title = JOptionPane.showInputDialog("Nombre de la canción:").toUpperCase();

                        do {
                            identifier = Integer.parseInt(JOptionPane.showInputDialog("Numero identificador:"));
                        } while (identifier < 5);

                        year = Integer.parseInt(JOptionPane.showInputDialog("Año canción:"));
                        month = (int) (Math.random() * 11);
                        day = (int) (Math.random() * 31 + 1);
                        duration = Integer.parseInt(JOptionPane.showInputDialog("Duración canción en segundos:"));
                        String[] optionsGenre = {"Rock", "Cumbia", "Pop", "Vallenato", "Regge", "Hip-Hop"};
                        genre = (String) JOptionPane.showInputDialog(null, "Género:",
                                "", JOptionPane.QUESTION_MESSAGE, null, optionsGenre, optionsGenre[0]);
                        cover = JOptionPane.showInputDialog("Imagen:");
                        description = JOptionPane.showInputDialog("Descripción:");

                        Song s = new Song(title, identifier, new Date(year - 1900, month - 1, day), duration, genre, cover, description);
                        library.add(s);
                        System.out.println("" + s.getTitle() + " / " + s.getGenre());

                        break;

                    case 2:
                        /////////////PLAYLIST/////////////////

                        namePlayList = JOptionPane.showInputDialog("Nombre de la playlist:").toUpperCase();
                        PlayList p1 = new PlayList(namePlayList);

                        ////////
                        String[] opti = new String[library.size()];
                        Song[] opti2 = new Song[library.size()];

                        for (int i = 0; i < library.size(); i++) {
                            opti[i] = library.get(i).getTitle();
                            opti2[i] = library.get(i);
                        }
                        String song = (String) JOptionPane.showInputDialog(null, "Canciones:",
                                "título", JOptionPane.QUESTION_MESSAGE, null, opti, opti[0]);
                        System.out.println("song: " + song);
                        ///////

                        //songs.add(library.get(3));
                        //songs.add(s2);
                        p1.setPlaylist(songs);
                        System.out.println("Playlist: " + p1.getNamePlayList());
                        System.out.println("Canciones: ");
                        p1.getPlaylist().forEach(so -> {
                            System.out.println("Titulo: " + so.getTitle() + " -Genero: " + so.getGenre());
                        });
                        break;

                    case 3:
                        System.out.println(library);
                        int selection2 = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Biblioteca",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new Object[]{"Ordenar por fecha", "Ordenar por duración", "Resetear", "Atras"}, "opcion 1");

                        switch (selection2 + 1) {
                            case 1:
                                System.out.println("Orden por fecha");
                                Collections.sort(library);
                                for(Song element: library) {
                                    System.out.println(element);
                                }
                                break;

                            case 2:
                                System.out.println("Orden por duración");
                        }

                        break;

                    default:
                    limit = 1;

                }
            }
            }catch(Throwable exc){
                System.out.println("Excepcion: " + exc);
            }
    }
}
