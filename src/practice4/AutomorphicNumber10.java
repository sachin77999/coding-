package practice4;

import java.util.Scanner;
public class AutomorphicNumber10 {

    private static boolean isAutomorphic(int number) {
        int count = 0;
        int square = number * number;

        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int lastDigit = (int) (square %  (Math.pow(10, count)));
        return number == lastDigit;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the starting value");
        start = scan.nextInt();
        System.out.println("Enter ending value");
        end = scan.nextInt();
        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i))
                System.out.println(i + " ");
        }
    }
}