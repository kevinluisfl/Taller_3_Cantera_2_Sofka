/**
 * Se importa el paquete classes y la libreria ArrayList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la clase Order con implementación de la interfaz IOrder.
 * @author kevinf y Juan David.
 */
public class Order implements IOrder  {
    /**
     * creé este array para no modificar el listado original, pero igual lo modifica y no entiendo porqué
     */
    ArrayList<Song> libraryOrder = new ArrayList<>();

    /**
     * Se hereda el siguiente metodo para ordenar la libreria de forma ascendente.
     * @param list de tipo ArrayList.
     * @param criterion de tipo String.
     * @return la libreria ordenada de forma ascendente.
     */
   @Override
   /**
    * Representa el caso de ordenamiento de forma ascendente con respecto a la duración,
    */
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
            /**
             * Representa un caso contrario para ordenar por fecha y no por duración.
             */
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

    /**
     * Se hereda el siguiente metodo para ordenar la libreria de forma descendente.
     * @param list de tipo ArrayList.
     * @param criterion de tipo String.
     * @return la libreria ordenada de forma descendente.
     */
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
            /**
             * Representa el caso contrario para ordenar la libreria por fecha y no por duración.
             */
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

    /**
     * Representa el metodo para reestablecer el orden de la libreria,
     * ordenandola por medio del identificador.
     * @param list de tipo ArrayList.
     * @return la libreria ordenada de acuerdo al identicador.
     */
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
