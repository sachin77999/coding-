package practice3;

import java.util.Scanner;
public class r46 {

    public static void main(String args[])
    {
        String s="Hoshiarpur";
        int count = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
