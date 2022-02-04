package org.iesfm;

import java.util.List;

public class Ej6 {
    public static double returnmedia(List<Double> numeros) throws EmptyListException {
        if (numeros.size() == 0) {
            throw new EmptyListException();
        }
        double suma = 0;
        for (double res : numeros) {
            suma = suma + res;
        }
        return suma / numeros.size();
    }
}

