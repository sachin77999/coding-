package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class sachin67 {

    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list.get(1));

        list.set(1,"amristar");
        for(String fruit:list)
            System.out.println(fruit);
    }
}
