import java.util.Scanner;

public class s17 {

    public static void main(String args[])
    {
        int a,b,c,temp,smallest;

        Scanner scan = new Scanner(System.in);
        // reading input from the user
        System.out.println("Enter first number");
        a = scan.nextInt();

        System.out.println("Enter second number");
        b = scan.nextInt();

        System.out.println("Enter third number");
        c = scan.nextInt();

        temp = a<b?a:b;
        smallest = c<temp?c:temp;

        System.out.println(smallest);
    }
}
