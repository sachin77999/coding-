package practice4;

import java.util.Scanner;
public class AutomorphicNumber2 {

    static boolean isAutomorphic(int number)
    {
        int square = number*number;
        while(number>0)
        {
            if(square%10!=number%10)
                return false;

            number = number/10;
            square = square/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(isAutomorphic(76)?"Automorphic":"Not Automorphic");
        System.out.println(isAutomorphic(13)?"Automorphic":"Not Automorphic");
    }
}
