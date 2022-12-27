package practice;
import java.util.Scanner;

public class sachin28 {

    public static void main(String args[])
    {
        int number,remainder=0;//76
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();//76
        int automorphic = number*number;//5776
        int temp = automorphic;//5776
        while(automorphic>0)//5776
        {
            remainder = automorphic%100;
           //5776%100=76
        }
        if(remainder == number) //76
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}
