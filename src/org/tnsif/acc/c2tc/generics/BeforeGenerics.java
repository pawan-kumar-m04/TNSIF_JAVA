package org.tnsif.acc.c2tc.generics;

import java.util.ArrayList;
import java.util.List;

public class BeforeGenerics {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("abc");
        list.add(Integer.valueOf(5));

        for (Object obj : list) {

            // Runtime error for Integer value
            String str = (String) obj;

            System.out.println(str);
        }
    }
}