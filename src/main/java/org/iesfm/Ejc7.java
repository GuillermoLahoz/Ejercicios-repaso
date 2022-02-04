package org.iesfm;

import java.util.List;

public class Ejc7 {
    public static int returnmax(List<Integer>numeros)throws EmptyListException{
        if (numeros.size()==0){
            throw new EmptyListException();
        }
        int maximo=Integer.MIN_VALUE;
        for (int minimo:numeros){
            if (minimo>maximo){
                maximo=minimo;
            }
        }
        return maximo;
    }
}
