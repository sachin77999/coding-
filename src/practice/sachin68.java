package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class sachin68 {

    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("sachin");
        list.add("rohan");
        list.add("pawan");
        list.add("shelly");

        System.out.println(list.get(1));
        list.set(1,"amristar");
        for(String fruit:list)
            System.out.println(fruit);
    }
}
