package classes;

import java.util.ArrayList;


public class PlayList {
    private String namePlayList;
    public ArrayList<Song> songs = new ArrayList<>();
 
    public PlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public String getNamePlayList() {
        return namePlayList;
    }

    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> song) {
        this.songs = song;
    }
 
}