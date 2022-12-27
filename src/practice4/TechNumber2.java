package practice4;

import java.util.Scanner;
public class TechNumber2 {

    public static void main(String args[])
    {
        for(int i=1;i<=1000000;i++)
        {
            int p1 = i%10;
            int p2 = i/10;
            int sum = p1+p2;
            if(i==(sum*sum))
                System.out.println(i);
        }
    }
}
