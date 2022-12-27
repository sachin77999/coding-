package practice3;

import java.util.Scanner;
public class r7 {

    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,4,5};
        int max = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
