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
     * Representa los atributos.
     */
    private String namePlayList;
    private ArrayList<Song> songs = new ArrayList<>();

    /**
     * Representa el metodo PlayList.
     * @param namePlayList
     */
    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el metodo getNamePlayList.
     * @return namePlayList.
     */
    public String getNamePlayList() {
        return namePlayList;
    }

    /**
     * Representa el metodo setNamePlayList.
     * @param namePlayList
     */
    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    /**
     * Representa el metodo getSongs.
     * @return songs.
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Representa el metodo setSongs.
     * @param song
     */
    public void setSongs(ArrayList<Song> song) {
        this.songs = song;
    }
 
}