/**
 * Se importa el paquete classes y la libreria ArraryList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la clase PlayList.
 * @authores Kevin y Juan David.
 */
public class PlayList {
    /**
     * Representa los atributos de la clase PlayList.
     */
    private String namePlayList;
    private ArrayList<Song> songs = new ArrayList<>();

    /**
     * Representa el metodo PlayList.
     * @param namePlayList de tipo String.
     */
    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el metodo getNamePlayList.
     * @return el nombre de la PlayList..
     */
    public String getNamePlayList() {
        return namePlayList;
    }

    /**
     * Representa el metodo setNamePlayList.
     * @param namePlayList de tipo String
     */
    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el metodo getSongs.
     * @return las canciones.
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Representa el metodo setSongs.
     * @param song de tipo ArrayList.
     */
    public void setSongs(ArrayList<Song> song) {
        this.songs = song;
    }

    /**
     * toString para visualizar la información de cada instancia
     * @return namePlayList, songs
     */
    @Override
    public String toString() {
        return "PlayList{" + "namePlayList=" + namePlayList + ", songs=" + songs + '}'+"\n";
    }
 
}