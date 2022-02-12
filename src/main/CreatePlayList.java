
package main;

import classes.Filter;
import classes.Operations;
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
            Song s1 = new Song("cancion 1", 1, new Date(102, 3, 12), 180, "Rock", "cover1.png", "descripción 1" + "\n");
            Song s2 = new Song("cancion 2", 2, new Date(85, 2, 21), 200, "Pop", "cover2.png", "descripción 2" + "\n");
            Song s3 = new Song("cancion 3", 3, new Date(103, 7, 24), 150, "Vallenato", "cover3.png", "descripción 3" + "\n");
            Song s4 = new Song("cancion 4", 4, new Date(89, 10, 10), 230, "Cumbia", "cover4.png", "descripción 4" + "\n");
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
                        new Object[]{"Agregar canción", "Crear playlist", "Ver biblioteca", "Cerrar"}, "opcion 1");


                switch (selection + 1) {
                    case 1:

                        ////////ATRIBUTOS DE CANCION
                        title = JOptionPane.showInputDialog("Nombre de la canción:").toUpperCase();
                        identifier = library.size()+1;
                        year = Integer.parseInt(JOptionPane.showInputDialog("Año canción:"));
                        month = (int) (Math.random() * 11);
                        day = (int) (Math.random() * 31 + 1);
                        duration = Integer.parseInt(JOptionPane.showInputDialog("Duración canción en segundos:"));
                        String[] optionsGenre = {"Rock", "Cumbia", "Pop", "Vallenato", "Regge", "Hip-Hop"};
                        genre = (String) JOptionPane.showInputDialog(null, "Género:",
                                "", JOptionPane.QUESTION_MESSAGE, null, optionsGenre, optionsGenre[0]);
                        cover = JOptionPane.showInputDialog("Imagen (URL):");
                        description = JOptionPane.showInputDialog("Descripción:");

                        Song s = new Song(title, identifier, new Date(year - 1900, month - 1, day), duration, genre, cover, description);
                        library.add(s);
                        System.out.println("Canción creada exitosamente y agregada a la biblioteca!");
                        System.out.println("" + s.getTitle() + " / " + s.getGenre());

                    break;

                    case 2:
                        /////////////PLAYLIST/////////////////

                        namePlayList = JOptionPane.showInputDialog("Nombre de la playlist:").toUpperCase();
                        PlayList p1 = new PlayList(namePlayList);

                        ////////
                        String[] options = new String[library.size()];

                        for (int i = 0; i < library.size(); i++) {
                            options[i] = library.get(i).getIdentifier()+"-"+library.get(i).getTitle();
                        }
                        boolean anotherSong = true;
                        do{
                            String songSelect = (String) JOptionPane.showInputDialog(null, "Selecciona la canción",
                                    namePlayList, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                            /**
                             * Se divide el string por el identificador de cancion, se parsea a entero y se resta 1 para tener su indice
                             */
                            int indexSong = Integer.parseInt(songSelect.split("-")[0])-1;
                            System.out.println("indice canción: " + indexSong);
                            songs.add(library.get(indexSong));
                            
                            int response =  JOptionPane.showConfirmDialog(null, "Agregar otra canción a "+namePlayList+"?", namePlayList, 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                            //yes=0, no=1
                            if(JOptionPane.OK_OPTION !=  response){
                                anotherSong = false;
                            }
                        }while(anotherSong);
                        ///////

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
                                new Object[]{"Ordenar", "Filtrar", "Resetear", "Atras"}, "opcion 1");
                        
                        Operations op = new Operations();
                        ArrayList<Song> libraryOrder = new ArrayList<>();
                        
                        switch (selection2 + 1) {
                            case 1:

                                int selection3 = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Biblioteca",
                                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                        new Object[]{"Ordenar por fecha", "Ordenar por duración", "Inicio"}, "opcion 1");

                                switch (selection3 + 1) {
                                    case 1:
                                    libraryOrder = op.ordersong(library, "fecha");
                                    System.out.println("Libreria ordenada por fecha al parecer:\n");
                                    for (Song element : libraryOrder) {
                                        System.out.println(element);
                                    }
                                    break;

                                    case 2:
                                        libraryOrder = op.ordersong(library, "duracion");
                                        System.out.println("Libreria ordenada por duracion al parecer:\n");
                                        for(Song element: libraryOrder) {
                                            System.out.println(element);
                                        }
                                        break;
                                }
                            break;

                            case 2:

                                int selection4 = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Biblioteca",
                                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                        new Object[]{"Filtrar por año", "Filtrar por genero", "Inicio"}, "opcion 1");

                                Filter filter = new Filter();
                                ArrayList<Song> libraryFilter = new ArrayList<>();

                                switch (selection4 + 1) {
                                    case 1:
                                        int yearFilter = Integer.parseInt(JOptionPane.showInputDialog("Escribe el año a filtrar: "));
                                        libraryFilter = filter.FilterYear(library, yearFilter);

                                        System.out.println("Libreria filtrada por año\n");
                                        for (Song element : libraryFilter) {
                                            System.out.println(element);
                                        }
                                        break;

                                    case 2:
                                        String[] optionGenreFilter = {"Rock", "Cumbia", "Pop", "Vallenato", "Regge", "Hip-Hop"};
                                        String genreFilter = (String) JOptionPane.showInputDialog(null, "Género:",
                                                "", JOptionPane.QUESTION_MESSAGE, null, optionGenreFilter, optionGenreFilter[0]);

                                        libraryFilter = filter.FilterGenre(library, genreFilter);
                                        System.out.println("Libreria filtrada por genero al parecer:\n");
                                        for(Song element: libraryFilter) {
                                            System.out.println(element);
                                        }

                                        break;
                                    default:
                                        System.out.println("fin1");
                                }
                                
                            break;
                            default:
                                System.out.println("Fin");
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
