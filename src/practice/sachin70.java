package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class sachin70 {

    public static void main(String args[])
    {
        List<String> list1 = new ArrayList<String>();
        list1.add("grapes");
        list1.add("mango");
        list1.add("banana");
        list1.add("apple");

        Collections.sort(list1);
        for(String fruit:list1)
            System.out.println(fruit);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(2);
        list2.add(15);
        list2.add(100);
        list2.add(9);

        Collections.sort(list2);
        for(Integer f:list2)
            System.out.println(f);
    }
}
