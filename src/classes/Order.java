
package classes;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class Order implements IOrder  {
    /**
     * creé este array para no modificar el listado original, pero igual lo modifica y no entiendo porqué
     */
    ArrayList<Song> libraryOrder = new ArrayList<>();

   @Override
    public ArrayList<Song> orderSongAsc(ArrayList<Song> list, String criterion) {
        libraryOrder = list;
        if(criterion.equals("duracion")){
            System.out.println("por duracion");
            for(int i = 0 ; i < libraryOrder.size(); i++){
                for(int j = 0; j < libraryOrder.size(); j++){
                    if(libraryOrder.get(i).getDuration() < libraryOrder.get(j).getDuration()){
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
        }else {
            System.out.println("por fecha");
            for(int i = 0 ; i < libraryOrder.size(); i++){
                for(int j = 0; j < libraryOrder.size(); j++){
                    if(libraryOrder.get(i).getMillis() < libraryOrder.get(j).getMillis()){
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
        }
        return libraryOrder;
    }

    @Override
    public ArrayList<Song> orderSongDesc(ArrayList<Song> list, String criterion) {
        libraryOrder = list;
        if(criterion.equals("duracion")){
            System.out.println("por duracion");
            for(int i = 0 ; i < libraryOrder.size(); i++){
                for(int j = 0; j < libraryOrder.size(); j++){
                    if(libraryOrder.get(i).getDuration() > libraryOrder.get(j).getDuration()){
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
        }else {
            System.out.println("por fecha");
            for(int i = 0 ; i < libraryOrder.size(); i++){
                for(int j = 0; j < libraryOrder.size(); j++){
                    if(libraryOrder.get(i).getMillis() > libraryOrder.get(j).getMillis()){
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
        }
        return libraryOrder;
    }
    
    public ArrayList<Song> orderIdentifier(ArrayList<Song> list){
        libraryOrder = list;
        for(int i = 0 ; i < libraryOrder.size(); i++){
                for(int j = 0; j < libraryOrder.size(); j++){
                    if(libraryOrder.get(i).getIdentifier() < libraryOrder.get(j).getIdentifier()){
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
        return libraryOrder;
    }
}
