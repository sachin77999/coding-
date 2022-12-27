package practice4;

import java.util.Scanner;
public class c7 {

    public static void main(String args[]) {

        System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
        System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }


    static boolean isAutomorphic(int number) {
        // determines the square of the specified number
        int square = number * number;

        while (number > 0) {
            if (number % 10 != square % 10)
                // return false if digits are not equal
                return false;

            number = number / 10;
            square = square / 10;
        }
        return true;
    }
}