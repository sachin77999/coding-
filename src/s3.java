import java.util.Scanner;

public class s3 {

    public static void main(String args[])
    {
        int start,end,sum=0;
        Scanner scan = new Scanner(System.in);
         System.out.print("Sum from :");
        start = scan.nextInt();
        System.out.print("Sum up to:");
        end = scan.nextInt();
        while(start<=end)
        {
            sum = sum+start;
            start++;
        }
        System.out.println(sum);

    }
}
