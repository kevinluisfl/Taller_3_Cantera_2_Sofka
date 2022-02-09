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

    public ArrayList<Song> getPlaylist() {
        return songs;
    }

    public void setPlaylist(ArrayList<Song> song) {
        this.songs = song;
    }
    
    
    
}