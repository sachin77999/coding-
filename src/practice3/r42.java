package practice3;

import java.util.Arrays;
public class r42 {

    public static void main(String args[])
    {
        int arr[] = new int[]{90,23,5,109,12,22,67,34};

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
