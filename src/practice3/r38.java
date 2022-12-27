package practice3;

import java.util.Scanner;
public class r38 {

    public static void main(String args[])
    {
        int arr[]={1,2,5,6,3,2};
        System.out.println("Odd Numbers");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
