package practice3;

import java.util.Scanner;
public class r59 {

    public static int search(int arr[],int x)
    {
        int n =arr.length;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = search(arr,x);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println(result);
    }
}
