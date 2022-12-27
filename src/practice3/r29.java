package practice3;

import java.util.Arrays;
import java.util.Scanner;
public class r29 {

    public static int getThirdLargest(int arr[],int total)
    {
        Arrays.sort(arr);
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
