package practice3;

import java.util.Scanner;
public class r13 {

    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,4,56,7};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max>arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
