package practice3;

import java.util.Arrays;
import java.util.Scanner;
public class r30 {

    public static int getThirdLargest(int arr[],int total)
    {
        Arrays.sort(arr);
        return arr[total-3];
    }

    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = {2,4,6,8};
        System.out.println(getThirdLargest(a,9));
        System.out.println(getThirdLargest(b,4));
    }
}
