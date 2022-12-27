import java.util.Scanner;

public class s9 {

    public static void main(String args[])
    {
        int number,i;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        i = 1;
        System.out.print("List of odd numbers:");

        while(i<=number)
        {
            System.out.println(i+" ");
            i=i+2;
        }
    }
}
