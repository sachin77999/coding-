package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class sachin69 {

    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();

        list.add("apple");
        list.add("grapes");
        list.add("banana");
        list.add("mango");
        Collections.sort(list);
        for(String fruit:list)
            System.out.println(fruit);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(13);
        list2.add(50);
        list2.add(90);
        list2.add(2);
        list2.add(3);
        Collections.sort(list2);
        for(Integer number:list2)
            System.out.println(number);


    }
}
