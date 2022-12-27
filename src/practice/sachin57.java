package practice;

import java.util.Scanner;
public class sachin57 {

    public static void main(String args[])
    {
        int num,n2,n3;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        n2=num*2;
        n3=num*3;
        String concatStr = num+""+n2+n3;
        boolean found=true;
        for(char c='1';c<='9';c++)
        {
            int count=0;
            for(int i=0;i<concatStr.length();i++) {
                char ch = concatStr.charAt(i);
                if(ch==c)
                    found=false;
                break;
            }
        }
        if(found)
            System.out.println(num+"is fascinating number");
        else
            System.out.println(num+"is not fascinating number");
    }
}
