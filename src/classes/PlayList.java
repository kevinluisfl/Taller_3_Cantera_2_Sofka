/**
 * Se importa el paquete classes y la libreria ArraryList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la clase PlayList.
 *
 * esta clase contiene las caracteristicas de creación de las playlist ej.:
 *
 * PlayList playlist = new PlayList(namePlayList); 
 * playlist.setSongs(song);
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
public class PlayList {

    /**
     * Representa los atributos de la clase PlayList.
     */
    private String namePlayList;
    private ArrayList<Song> songs = new ArrayList<>();

    /**
     * Representa el método PlayList.
     *
     * @param namePlayList de tipo String.
     */
    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el método getNamePlayList.
     *
     * @return el nombre de la PlayList..
     */
    public String getNamePlayList() {
        return namePlayList;
    }

    /**
     * Representa el método setNamePlayList.
     *
     * @param namePlayList de tipo String
     */
    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el método getSongs.
     *
     * @return las canciones.
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Representa el método setSongs.
     *
     * @param song de tipo ArrayList.
     */
    public void setSongs(ArrayList<Song> song) {
        this.songs = song;
    }

    /**
     * toString para visualizar la información de cada instancia
     *
     * @return namePlayList, songs
     */
    @Override
    public String toString() {
        return "PlayList{" + "namePlayList=" + this.getNamePlayList() 
                + ", songs=" + this.getSongs() + '}' + "\n";
    }

}
