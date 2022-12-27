package practice4;

import java.util.Scanner;
public class SunnyNumber9 {

    public static boolean isSunnyNumber(int number)
    {
        if(Math.sqrt(number+1)%1==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int lr=0,ur=0;
        Scanner scan = new Scanner(System.in);

        lr = scan.nextInt();
        ur = scan.nextInt();

        for(int i=lr;i<=ur;i++)
        {
            if(isSunnyNumber(i))
                System.out.println(i+" ");
        }
    }
}
