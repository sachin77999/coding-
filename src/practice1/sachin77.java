package practice1;

import java.util.Scanner;
public class sachin77 {

    public static void main(String args[])
    {

        int balance = 100000,withdraw,deposit;

    Scanner scan = new Scanner(System.in);

    while(true)
    {
        System.out.println("Automated Teller Machine");
        System.out.println("choose 1 for withdraw");
        System.out.println("choose 2 for deposit");
        System.out.println("choose 3 for Check Balance");
        System.out.println("choose 4 for EXIT");
        System.out.println("choose the operation you want to perform");

        int choice = scan.nextInt();
        switch (choice)
        {
            case 1:
           System.out.println("Enter money to be withdrawn");

           withdraw = scan.nextInt();

           if(balance>=withdraw)
           {
               balance=balance-withdraw;
               System.out.println("Please collect your money");
           }
           else
           {
               System.out.println("Insufficient Balance");
           }
           System.out.println("");
           break;

            case 2:
                System.out.println("Enter money to be deposited");

                deposit=scan.nextInt();
                balance=balance+deposit;
                System.out.println("Your money has been successfully deposited");
                System.out.println("");
                break;

            case 3:
                System.out.println(balance);
                break;

            case 4:
                System.exit(0);
        }
    }
    }
}
