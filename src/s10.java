import java.util.Scanner;
public class s10 {

    public static void main(String args[])
    {
        int number,i=1;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        while(i<=number)
        {
            System.out.print(i+" ");
            i = i+2;
        }
    }
}
