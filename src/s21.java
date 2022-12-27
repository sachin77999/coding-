import java.util.Scanner;
public class s21 {

    public static void main(String args[])
    {
        int a=50,b=60,c=70;

        if(a>=b && a>=c)
            System.out.println(a+"is the largest number");
        else if(b>=a && b>=c)
            System.out.println(b+"is the largest number");
        else
            System.out.println(c+"is the largest number");
    }
}
