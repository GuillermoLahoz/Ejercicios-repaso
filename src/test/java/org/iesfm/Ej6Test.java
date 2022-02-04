package org.iesfm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej6Test {
    @Test
    public void returnmedia ()throws EmptyListException{
        List<Double> numeros = new ArrayList<>();
        numeros.add(2.1);
        numeros.add(2.2);
        numeros.add(2.3);
        numeros.add(2.4);
        double res = Ej6.returnmedia(numeros);
        Assert.assertEquals(2.25,res, 0.000001);
    }
    @Test(expected = EmptyListException.class)
    public void noreturnmedia ()throws EmptyListException{
        List<Double> numeros = new ArrayList<>();

        double res = Ej6.returnmedia(numeros);
        Assert.assertEquals(2.25,res, 0.000001);
    }
}


