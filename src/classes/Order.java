/**
 * Se importa el paquete classes y la libreria ArrayList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la clase Order con implementación de la interfaz IOrder.
 *
 * Esta clase contiene los métodos implementados para ordenar las canciones ej.:
 *
 * Order order = new Order(); order.orderSongAsc(list, criterion);
 *
 * list es el array a ordenar, criterion es el valor que define por cuál
 * atributo se va a ordenar
 *
 * @version 1.00.000 2022-02-14, La clase corresponde a la versión 1 del
 * sistema, la misma no a sufrido refactorings durante la versión no se
 * realizaron cambios menores el último cambio fue realizado el 14 de febrero de
 * 2022
 *
 * @author Kevin Luis Flórez y Juan David Restrepo
 *
 * @since 1.00.000
 *
 */
public class Order implements IOrder {

    /**
     * el arraylist libraryOrder almacena el arraylist ordenado
     */
    ArrayList<Song> libraryOrder = new ArrayList<>();

    /**
     * Se implementa el siguiente metodo orderSongAsc de la interfaz IOrder para
     * ordenar la libreria por duración o fecha de forma ascendente.
     *
     * @param list de tipo ArrayList.
     * @param criterion de tipo String.
     * @return la libreria ordenada de forma ascendente.
     */
    @Override
    public ArrayList<Song> orderSongAsc(ArrayList<Song> list, String criterion) {
        libraryOrder = list;
        if (criterion.equals("duración")) {
            System.out.println("por duración");
            for (int i = 0; i < libraryOrder.size(); i++) {
                for (int j = 0; j < libraryOrder.size(); j++) {
                    if (libraryOrder.get(i).getDuration() < libraryOrder.get(j).getDuration()) {
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
            /**
             * Representa el caso para ordenar por fecha y no por
             * duración.
             */
        } else {
            System.out.println("por fecha");
            for (int i = 0; i < libraryOrder.size(); i++) {
                for (int j = 0; j < libraryOrder.size(); j++) {
                    if (libraryOrder.get(i).getMillis() < libraryOrder.get(j).getMillis()) {
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
     * Se implementa el siguiente método orderSongDesc de la interfaz IOrder
     * para ordenar la libreria por duración o fecha de forma descendente.
     *
     * @param list de tipo ArrayList.
     * @param criterion de tipo String.
     * @return la libreria ordenada de forma descendente.
     */
    @Override
    public ArrayList<Song> orderSongDesc(ArrayList<Song> list, String criterion) {
        libraryOrder = list;
        if (criterion.equals("duración")) {
            System.out.println("por duración");
            for (int i = 0; i < libraryOrder.size(); i++) {
                for (int j = 0; j < libraryOrder.size(); j++) {
                    if (libraryOrder.get(i).getDuration() > libraryOrder.get(j).getDuration()) {
                        Song aux = libraryOrder.get(i);
                        libraryOrder.set(i, libraryOrder.get(j));
                        libraryOrder.set(j, aux);
                    }
                }
            }
            /**
             * Representa el caso para ordenar la libreria por fecha y
             * no por duración.
             */
        } else {
            System.out.println("por fecha");
            for (int i = 0; i < libraryOrder.size(); i++) {
                for (int j = 0; j < libraryOrder.size(); j++) {
                    if (libraryOrder.get(i).getMillis() > libraryOrder.get(j).getMillis()) {
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
     * Representa el método para reestablecer el orden de la libreria,
     * ordenándola por medio del identificador.
     *
     * @param list de tipo ArrayList.
     * @return la libreria ordenada de acuerdo al identificador.
     */
    public ArrayList<Song> orderIdentifier(ArrayList<Song> list) {
        libraryOrder = list;
        for (int i = 0; i < libraryOrder.size(); i++) {
            for (int j = 0; j < libraryOrder.size(); j++) {
                if (libraryOrder.get(i).getIdentifier() < libraryOrder.get(j).getIdentifier()) {
                    Song aux = libraryOrder.get(i);
                    libraryOrder.set(i, libraryOrder.get(j));
                    libraryOrder.set(j, aux);
                }
            }
        }
        return libraryOrder;
    }
}
