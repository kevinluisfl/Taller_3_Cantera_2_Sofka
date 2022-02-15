/**
 * Se importa el paquete classes y la libreria ArrayList.
 */
package classes;

import java.util.ArrayList;

/**
 * Representa la interfaz IFilter.
 *
 * Contiene los métodos abstractos que necesiten distintos comportamientos de
 * filtrado
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
public interface IFilter {
    /**
     * métodos abstractos para implementar
     * 
     * @param list de tipo ArratList.
     * @param year de tipo int.
     * @return ArrayList tipo Song
     */
    public ArrayList<Song> filterYear(ArrayList<Song> list, int year);

    /**
     * 
     * @param list de tipo ArrayList
     * @param genre de tipo String
     * @return ArrayList tipo Song
     */
    public ArrayList<Song> filterGenre(ArrayList<Song> list, String genre);
}
