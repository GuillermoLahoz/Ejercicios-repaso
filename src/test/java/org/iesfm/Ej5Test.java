package org.iesfm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej5Test {

    @Test
    public void  returnsuma(){
        List<Double>resultado= new ArrayList<>();
        resultado.add(2.1);
        resultado.add(2.4);
        resultado.add(2.5);
        resultado.add(2.6);

        double res = Ej5.returnsuma(resultado);
        Assert.assertEquals(9.6, res, 0.0000001);
    }
}
