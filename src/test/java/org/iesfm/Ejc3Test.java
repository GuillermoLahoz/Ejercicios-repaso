package org.iesfm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ejc3Test {
    @Test
    public void returnString() throws EmptyListException {
        List<String>stringList=new ArrayList<>();
        stringList.add("hola");
        stringList.add("pepe");
        stringList.add("ads");
        stringList.add("manolo");

        String res=Ejc3.returnString(stringList);

        Assert.assertEquals("hola",res);
    }

    @Test (expected = EmptyListException.class)
    public void noReturnString() throws EmptyListException {
        List<String>stringList=new ArrayList<>();

        String res=Ejc3.returnString(stringList);

        Assert.assertEquals("hogbfgbla",res);
    }
}
