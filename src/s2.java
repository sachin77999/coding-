import java.util.Scanner;

public class s2 {

    public static void main(String args[])
    {
        int start,end,sum=0,i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sum start from");
        start = scan.nextInt();

        System.out.println("Sum upto");
        end = scan.nextInt();

        while(start<=end)
        {
            sum = sum+start;
            start++;
        }
        System.out.println(sum);
    }
}
