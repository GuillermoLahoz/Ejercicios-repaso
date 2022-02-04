package org.iesfm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ej4Test {
    @Test
    public void returnString()throws EmptyListException{
        List<String>stringList=new ArrayList<>();
        stringList.add("algo");
        stringList.add("despues");
        stringList.add("quizas");
        stringList.add("hola");
        String returnString= ej4.returnString(stringList);
        Assert.assertEquals("hola",returnString);
}

  @Test(expected = EmptyListException.class)
    public void noreturnString()throws EmptyListException{
        List<String>stringList=new ArrayList<>();

        String returnString= ej4.returnString(stringList);
        Assert.assertEquals("hola",returnString);
}
    }
