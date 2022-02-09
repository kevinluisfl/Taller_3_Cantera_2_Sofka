package com.company;

import java.util.ArrayList;


public class PlayList extends Song {
    public static ArrayList<PlayList> list = new ArrayList<>();
    private String namePlayList;


    public PlayList(String title) {
        super(title);
    }

    public static ArrayList<PlayList> getList() {
        return list;
    }

    public static void setList(ArrayList<PlayList> list) {
        PlayList.list = list;
    }

    public static PlayList createPlayList(String title) {
        PlayList playList = new PlayList(title);
        list.add(playList);

        for (int i = 0; i < list.size(); i ++) {
            System.out.println("Titulo: " + list.get(i).getTitle());
        }
        return playList;
    }

}
