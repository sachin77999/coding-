import java.util.Scanner;
public class s16 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        double number = scan.nextDouble();
        if(checkPerfectSquareNumber(number))
            System.out.println("Yes,the given number is a perfect square");
        else
            System.out.println("No, the given number is not perfect square");
    }
    static boolean checkPerfectSquareNumber(double number)
    {
        for(int i=1;i*i<=number;i++)
        {
            if((number%i==0) && (number/i==i))
            {
                return true;
            }
        }
        return false;
    }
}
