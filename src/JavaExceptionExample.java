import java.util.Scanner;
public class JavaExceptionExample {

    public static void main(String args[])
    {
        try {

            int data = 100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            // rest code of the program
            System.out.println("rest of the code...");
        }
    }
}
