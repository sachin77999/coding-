package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class sachin64 {

    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sachin");
        list.add("rohan");
        list.add("pawan");
        list.add("shelly");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
