package org.iesfm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej7Test {
    @Test
    public void returnmax() throws EmptyListException{
        List<Integer>numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);
        numeros.add(1);
        int max = Ejc7.returnmax(numeros);
        Assert.assertEquals(7,max);
    }
    @Test(expected = EmptyListException.class)
    public void noreturnmax() throws EmptyListException{
        List<Integer>numeros = new ArrayList<>();

        int max = Ejc7.returnmax(numeros);
        Assert.assertEquals(7,max);
    }
}
