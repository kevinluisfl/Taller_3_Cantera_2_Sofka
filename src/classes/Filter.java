package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Filter implements IFilter {
    ArrayList<Song> libraryFilter = new ArrayList<>();

    @Override
    public ArrayList<Song> FilterYear(ArrayList<Song> list, int y) {

        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");


        for (Song i: list) {
            int yearSong = Integer.parseInt (getYearFormat.format(i.getDate()));
            if (yearSong == y) {
                libraryFilter.add(i);
            }
        }

        return libraryFilter;
    }

    @Override
    public ArrayList<Song> FilterGenre(ArrayList<Song> list, String g) {

        for (Song i: list) {
            if (i.getGenre() == g) {
                libraryFilter.add(i);
            }
        }
        return libraryFilter;
    }
}
