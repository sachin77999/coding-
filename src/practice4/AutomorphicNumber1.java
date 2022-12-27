package practice4;

import java.util.Scanner;
public class AutomorphicNumber1 {

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
    public static void main(String args[])
    {
//number to be check
//calling the method and prints the result accordingly
        System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
        System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }

}
