import java.util.Scanner;

public class s1 {

    public static void main(String args[])
    {
        int number,sum=0,i=1;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        while(i<=number)
        {
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
