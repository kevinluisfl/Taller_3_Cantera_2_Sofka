
package classes;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class Operations implements IOrder  {

   @Override
    public ArrayList<Song> ordersong(ArrayList<Song> list, String criterion) {
        if(criterion.equals("duracion")){
            System.out.println("por duracion");
            for(int i = 0 ; i < list.size(); i++){
                for(int j = 0; j < list.size(); j++){
                    if(list.get(i).getDuration() < list.get(j).getDuration()){
                        Song aux = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, aux);
                    }
                }
            }
            return list;
        }else {
            System.out.println("por fecha");
            for(int i = 0 ; i < list.size(); i++){
                for(int j = 0; j < list.size(); j++){
                    if(list.get(i).getMillis() < list.get(j).getMillis()){
                        Song aux = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, aux);
                    }
                }
            }
            return list;
        }

    }


}
