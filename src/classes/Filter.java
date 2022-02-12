package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Filter implements IFilter {
    ArrayList<Song> libraryFilter = new ArrayList<>();
    
    SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");

    @Override
    public ArrayList<Song> FilterYear(ArrayList<Song> list, int year) {

        for (Song item: list) {
            int yearSong = Integer.parseInt (getYearFormat.format(item.getDate()));
            if (yearSong == year) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }

    @Override
    public ArrayList<Song> FilterGenre(ArrayList<Song> list, String genre) {

        for (Song item: list) {
            if (item.getGenre() == genre) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }
}
