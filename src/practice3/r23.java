package practice3;

import java.util.Scanner;
public class r23 {

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
    int a[] = {1,2,5,6,3,2};
    int b[] = {44,66,99,77,33,22,55};

    System.out.println(getThirdLargest(a,6));
    System.out.println(getThirdLargest(b,7));
}
}
