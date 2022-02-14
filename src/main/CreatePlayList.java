/**
 * Se importa el paquete main, la clase Filter, Order, PlayList, Song
 * y las librerias ArrayList, Date, JOptionPane.
 */
package main;

import classes.Filter;
import classes.Order;
import classes.PlayList;
import classes.Song;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * Representa la clase CreatePlayList.
 * @author kevinf y Juan David.
 */
public class CreatePlayList {

    /**
     * Representa el metodo principal para la ejecución del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 * Representa la implementación de try catch para las excepciones.
 */
        try {
            /**
             * Representa las variables a usar.
             */
            String title, genre, cover, description, namePlayList;
            int identifier, year, month, day, duration, limit = 0;

            /**
             * Representa un ArrayList para guardar objetos de clases.
             */
            ArrayList<Song> library = new ArrayList<>();
            ArrayList<PlayList> playlists = new ArrayList<>();
            
            /**
             * Representa las canciones que estan precargadas.
             */
            Song s1 = new Song("Canción 1", 1, new Date(102, 3, 12), 180, "Rock", "cover1.png", "descripción 1");
            Song s2 = new Song("Canción 2", 2, new Date(85, 2, 21), 200, "Pop", "cover2.png", "descripción 2");
            Song s3 = new Song("Canción 3", 3, new Date(103, 7, 24), 150, "Vallenato", "cover3.png", "descripción 3");
            Song s4 = new Song("Canción 4", 4, new Date(89, 10, 10), 230, "Cumbia", "cover4.png", "descripción 4");
            Song s5 = new Song("Canción 5", 5, new Date(115, 6, 8), 210, "Hip-Hop", "cover5.png", "descripción 5");
            library.add(s1);
            library.add(s2);
            library.add(s3);
            library.add(s4);
            library.add(s5);
            
            /**
             * Reresenta las playlist que etsan precargadas.
             */
            PlayList pL1= new PlayList("Playlist 1");
            PlayList pL2= new PlayList("Playlist 2");
            PlayList pL3= new PlayList("Playlist 3");
            playlists.add(pL1);
            playlists.add(pL2);
            playlists.add(pL3);

        /**
         * Representa el bucle while para que el programa no finalice hasta que el usuario lo desee.
         */
            while (limit == 0) {
                /**
                 * Representa el menu principal, con las opciones a ejecutar.
                 */
                int selectionMenu = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Menu",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Agregar canción", "Playlist", "Ver biblioteca", "Cerrar"}, "opcion 1");
        /**
         * Representa la sentencia switch para poder acceder a las diferentes opciones del menú.
         */
                switch (selectionMenu + 1) {
                    /**
                     * El caso representa la opción de agregar una canción.
                     */
                    case 1:

                        ////////ATRIBUTOS DE CANCION
                        title = JOptionPane.showInputDialog("Nombre de la canción:");
                        identifier = library.size()+1;
                        year = Integer.parseInt(JOptionPane.showInputDialog("Año canción:"));
                        month = (int) (Math.random() * 11);
                        day = (int) (Math.random() * 31 + 1);
                        duration = Integer.parseInt(JOptionPane.showInputDialog("Duración canción en segundos:"));
                        String[] optionsGenre = {"Rock", "Cumbia", "Pop", "Vallenato", "Regge", "Hip-Hop"};
                        genre = (String) JOptionPane.showInputDialog(null, "Género:",
                                "Selección género", JOptionPane.QUESTION_MESSAGE, null, optionsGenre, optionsGenre[0]);
                        cover = JOptionPane.showInputDialog("Imagen (URL):");
                        description = JOptionPane.showInputDialog("Descripción:");

                        Song s = new Song(title, identifier, new Date(year - 1900, month - 1, day), duration, genre, cover, description);
                        library.add(s);
                        System.out.println("Canción creada exitosamente y agregada a la biblioteca!");
                        JOptionPane.showMessageDialog(null, "Canción creada exitosamente y agregada a la biblioteca!");
                        System.out.println("" + s.getTitle() + " / " + s.getGenre());

                    break;

                    /**
                     * El caso 2 representa un submenú para la playlist.
                     */
                    case 2:
                        /////////////PLAYLIST/////////////////
                        int selectionPlayList = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "PlayList",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new Object[]{"Crear PlayList", "Ver PlayList", "Atras"}, "opcion 1");
                /**
                 * Representa un switch para navegar entre las opciones del submenú playlist.
                 */
                        switch (selectionPlayList + 1) {
                            /**
                             * El caso 1 del submenu playlist representa la opción de crear playlist.
                             */
                            case 1:
                                ArrayList<Song> songs = new ArrayList<>();
                                namePlayList = JOptionPane.showInputDialog("Nombre de la playlist:");
                                PlayList pl = new PlayList(namePlayList);

                                String[] optionsSong = new String[library.size()];

                                for (int i = 0; i < library.size(); i++) {
                                    optionsSong[i] = (i+1)+"- "+library.get(i).getTitle();
                                }
                                boolean anotherSong = true;
                                do{
                                    String songSelect = (String) JOptionPane.showInputDialog(null, "Selecciona la canción",
                                            namePlayList, JOptionPane.QUESTION_MESSAGE, null, optionsSong, optionsSong[0]);
                                    /**
                                     * Se divide el string por el identificador de cancion, se parsea a entero y se resta 1 para tener su indice
                                     */
                                    int indexSong = Integer.parseInt(songSelect.split("-")[0])-1;
                                    songs.add(library.get(indexSong));

                                    int response =  JOptionPane.showConfirmDialog(null, "Agregar otra canción a "+namePlayList+"?", namePlayList, 
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                                    
                                    if(JOptionPane.OK_OPTION !=  response){
                                        anotherSong = false;
                                    }
                                }while(anotherSong);

                                pl.setSongs(songs);
                                playlists.add(pl);
                                System.out.println("Playlist: " + pl.getNamePlayList());
                                System.out.println("Canciones: ");
                                pl.getSongs().forEach(so -> {
                                    System.out.println("Titulo: " + so.getTitle() + " -Genero: " + so.getGenre());
                                });
                            break;
                            /**
                             * El caso 2 representa la opción de ver las playlist que hay creadas.
                             */
                            case 2:
                                ///mostrar playlists y select con las playlist creadas
                                String[] optionsPlayList = new String[library.size()];

                                for (int i = 0; i < playlists.size(); i++) {
                                    optionsPlayList[i] = (i+1)+"- "+playlists.get(i).getNamePlayList();
                                }
                                String playListSelect = (String) JOptionPane.showInputDialog(null, "Selecciona la PlayList",
                                            "PlayList", JOptionPane.QUESTION_MESSAGE, null, optionsPlayList, optionsPlayList[0]);
                                
                                int indexPlayList = Integer.parseInt(playListSelect.split("-")[0])-1;
                                
                                PlayList playListSelected = playlists.get(indexPlayList);
                                
                                System.out.println("Playlist: " + playListSelected.getNamePlayList());
                                System.out.println("Canciones: ");
                                playListSelected.getSongs().forEach(so -> {
                                    System.out.println("Titulo: " + so.getTitle() + " -Genero: " + so.getGenre());
                                });
                                
                                /////////////////////////////////////////////////////////////////////
                                
                                int response =  JOptionPane.showConfirmDialog(null, "Agregar otra canción a "+playListSelected.getNamePlayList()+"?", playListSelected.getNamePlayList(), 
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                                if(JOptionPane.OK_OPTION ==  response){
                                    ArrayList<Song> songsPlayList = playListSelected.getSongs();
                                    optionsSong = new String[library.size()];

                                    for (int i = 0; i < library.size(); i++) {
                                        optionsSong[i] = (i+1)+"- "+library.get(i).getTitle();
                                    }
                                        anotherSong = true;
                                    do{
                                        String songSelect = (String) JOptionPane.showInputDialog(null, "Selecciona la canción",
                                                playListSelected.getNamePlayList(), JOptionPane.QUESTION_MESSAGE, null, optionsSong, optionsSong[0]);
                                        
                                        int indexSong = Integer.parseInt(songSelect.split("-")[0])-1;
                                        songsPlayList.add(library.get(indexSong));

                                        response =  JOptionPane.showConfirmDialog(null, "Agregar otra canción a "+playListSelected.getNamePlayList()+"?", playListSelected.getNamePlayList(), 
                                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                                        if(JOptionPane.OK_OPTION !=  response){
                                            anotherSong = false;
                                        }
                                    }while(anotherSong);
                                    playListSelected.setSongs(songsPlayList);
                                }
                                
                                /////////////////////////////////////////////////////////////////////
                                
                            break;
                            default:
                                System.out.println("default Fin switch playlist");
                        }
                    break;

                    /**
                     * El caso 3 representa la opción de ver la biblioteca que se encuentra en el menu principal,
                     * a su vez lleva a un submenú de la bilbioteca.
                     */
                    case 3:
                        System.out.println(library);
                        int selectionLibrary = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Biblioteca",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new Object[]{"Ordenar", "Filtrar", "Resetear", "Atras"}, "opcion 1");
                        
                        Order order = new Order();
                        ArrayList<Song> libraryOrder = new ArrayList<>();
                        /**
                         * Representa un switch para navegar en el submenu de biblioteca.
                         */
                        switch (selectionLibrary + 1) {
                            /**
                             * El caso 1 representa un submenú de "ordenar" que permite ordenar la bilioteca.
                             */
                            case 1:

                                int selectionOrder = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Ordenar Biblioteca",
                                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                        new Object[]{"Fecha Asc", "Fecha Desc", "Duración Asc", "Duración Desc", "Inicio"}, "opcion 1");
                        /**
                         * Representa un nuevo switch para navegar en el submenu de ordenar.
                         */
                                switch (selectionOrder + 1) {

                                    /**
                                     * El caso 1 permite ordenar la libreria de canciones de forma ascendente
                                     * con respecto a la fecha.
                                     */
                                    case 1:
                                        libraryOrder = order.orderSongAsc(library, "fecha");
                                        System.out.println("Libreria ordenada por fecha ascendente:\n");
                                        for (Song element : libraryOrder) {
                                            System.out.println(element);
                                        }
                                    break;

                                    /**
                                     * El caso 2 permite ordenar la libreria de canciones de forma descendente
                                     * con respecto a la fecha.
                                     */
                                    case 2:
                                        libraryOrder = order.orderSongDesc(library, "fecha");
                                        System.out.println("Libreria ordenada por fecha descendente:\n");
                                        for (Song element : libraryOrder) {
                                            System.out.println(element);
                                        }
                                    break;

                                    /**
                                     * El caso 3 permite ordenar la libreria de canciones de forma ascendente
                                     * con respecto a la duración.
                                     */
                                    case 3:
                                        libraryOrder = order.orderSongAsc(library, "duracion");
                                        System.out.println("Libreria ordenada por duracion ascendente:\n");
                                        for(Song element: libraryOrder) {
                                            System.out.println(element);
                                        }
                                    break;

                                    /**
                                     * El caso 3 permite ordenar la libreria de canciones de forma descendente
                                     * con respecto a la duración.
                                     */
                                    case 4:
                                        libraryOrder = order.orderSongDesc(library, "duracion");
                                        System.out.println("Libreria ordenada por duracion descendente:\n");
                                        for(Song element: libraryOrder) {
                                            System.out.println(element);
                                        }
                                    break;
                                    default:
                                        System.out.println("default Fin switch ordenar");
                                }
                            break;

                            /**
                             * El caso 2 representa el submenu de filtrar.
                             */
                            case 2:

                                int selectionFilter = JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Filtrar Biblioteca",
                                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                        new Object[]{"Filtrar por año", "Filtrar por genero", "Inicio"}, "opcion 1");

                                Filter filter = new Filter();
                                ArrayList<Song> libraryFilter = new ArrayList<>();
                        /**
                         * Representa un switch para navegar en el submenú de filtrar.
                         */
                                switch (selectionFilter + 1) {

                                    /**
                                     * El caso 1 representa el filtro de la canción con respecto al año.
                                     */
                                    case 1:
                                        int yearFilter = Integer.parseInt(JOptionPane.showInputDialog("Escribe el año a filtrar: "));
                                        libraryFilter = filter.FilterYear(library, yearFilter);

                                        System.out.println("Libreria filtrada por año\n");
                                        for (Song element : libraryFilter) {
                                            System.out.println(element);
                                        }
                                    break;

                                    /**
                                     * El caso 2 representa el filtro con respecto al genero.
                                     */
                                    case 2:
                                        String[] optionGenreFilter = {"Rock", "Cumbia", "Pop", "Vallenato", "Regge", "Hip-Hop"};
                                        String genreFilter = (String) JOptionPane.showInputDialog(null, "Género:",
                                                "", JOptionPane.QUESTION_MESSAGE, null, optionGenreFilter, optionGenreFilter[0]);

                                        libraryFilter = filter.FilterGenre(library, genreFilter);
                                        System.out.println("Libreria filtrada por genero:\n");
                                        for(Song element: libraryFilter) {
                                            System.out.println(element);
                                        }

                                    break;
                                    default:
                                        System.out.println("default Fin switch filtro");
                                }
                                
                            break;
                            /**
                             * El caso 3 representa la opción para reestablecer el orden de la libreria.
                             */
                            case 3:
                                System.out.println("Libreria reseteada:\n");
                                order.orderIdentifier(library);
                                for(Song element: library) {
                                    System.out.println(element);
                                }
                            break;
                            default:
                                System.out.println("default Fin switch biblioteca");
                        }
                    break;

                    default:
                        System.out.println("default Fin switch Menú");
                        limit = 1;
                }
            }
            }catch(Throwable exc){
                System.out.println("Excepcion: " + exc);
            }
    }
}
