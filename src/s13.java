import java.util.Scanner;

public class s13 {

    static boolean checkPerfectSquareNumber(double number)
    {
        double sqrt = Math.sqrt(number);

        return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        double number = scan.nextDouble();

        if(checkPerfectSquareNumber(number))
            System.out.println("yes , the given number is perfect square");
        else
            System.out.println("No,the given number is not perfect square");
    }
}
