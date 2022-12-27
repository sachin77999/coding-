package practice1;

import java.util.Scanner;
public class sachin101 {

    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        // 3
        int num = 1,count=0,i;
        while(count<n)   // (0<3)
        {
            num = num+1;   // num = 2;
            for(i=2;i<=num;i++)   //  2<=2;
            {
                if(num%i==0)      // 2%2==0(0)
                {
                    break;
                }
            }
            if(i == num)       // (2 == 2)
            {
                count = count+1;    // count = 0+1;
            }
        }
        System.out.println("The "+ n+"th prime number is:" + num);
    }
}
