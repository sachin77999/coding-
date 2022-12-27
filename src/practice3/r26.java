package practice3;

import java.util.Scanner;
public class r26 {

    public static int getThirdLargest(int arr[],int total)
    {
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total-3];
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={2,4,6,8,10,12,14};
        System.out.println(getThirdLargest(a,9));
        System.out.println(getThirdLargest(b,7));
    }
}
