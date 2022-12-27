package practice3;

import java.util.Scanner;
public class r5 {

    public static void main(String args[])
    {
        int arr[] = new int[]{25,11,7,75,56};
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
