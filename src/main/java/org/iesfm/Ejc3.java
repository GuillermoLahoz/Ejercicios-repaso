package org.iesfm;

import java.util.List;

public class Ejc3 {

    public static String returnString(List<String>words) throws  EmptyListException{
        if (words.size() != 0) {
            return words.get(0);
        }
        throw new EmptyListException();
    }

}
