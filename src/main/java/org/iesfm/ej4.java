package org.iesfm;

import java.util.List;


public class ej4 {
    /**
     * Escribe un método que dada una lista de String y devuelva el que está en la última posición.
     * Si no hay lanza una excepción EmptyListException.
     * @param words lista donde voy a buscar
     * @return doy la ultima palabra de la lista
     * @throws EmptyListException se lanza cuando no hay algo en la lista
     */
    public static String returnString(List<String> words)throws EmptyListException{
    if (words.size() != 0) {
        return words.get(words.size()-1);
    }
throw new EmptyListException();

}
}
