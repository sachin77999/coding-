import java.util.Scanner;

public class s15 {


    static boolean checkPerfectSquareNumber(double number)
    {
        double sqrt = Math.sqrt(number);
        return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();

        if(checkPerfectSquareNumber(number))
            System.out.println("Yes, the given number is a perfect square");
        else
            System.out.println("No , the given number is not perfect square");

    }
}
