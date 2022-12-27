package practice4;

import java.util.Scanner;
public class c8 {

    public static void main(String args[])
    {
        System.out.println(isAutomorphic(76)?"Automorphic Number":"Not Automorphic Number");
        System.out.println(isAutomorphic(13)?"Automorphic Number":"Not Automorphic Number");
    }

    static boolean isAutomorphic(int number)
    {
        int square = number*number;

        while(number>0)
        {
            if(number%10!=square%10)
                return false;
            number = number/10;
            square = square/10;
        }
        return true;
    }
}
