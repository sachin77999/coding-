import java.util.Scanner;
public class s8 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
