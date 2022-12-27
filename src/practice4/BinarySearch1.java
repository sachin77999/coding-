package practice4;

import java.util.Scanner;
public class BinarySearch1 {

    int binarySearch(int arr[],int l,int r,int x)
    {
        if(r>=l)
        {
            int mid = l+(r-l)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[mid]>x)
                return binarySearch(arr,l,mid-1,x);
            return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch1 ob = new BinarySearch1();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 40;
        int result = ob.binarySearch(arr,0,n-1,x);
        if(result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println(result);
    }
}
