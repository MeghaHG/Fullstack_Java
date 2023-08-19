package controlflowstatement;

import java.util.Scanner;

public class ScannerSum {

    public static  void main(String[] args) {

      int n,s=0;
        Scanner sc= new Scanner(System.in);
        char choice;

        do{
            System.out.println("Enter value");
            n = sc.nextInt();
            s = s + n;

            System.out.println("do you want to continue");
            choice = sc.next().charAt(0);
        }while (choice=='Y' || choice=='y');

        System.out.println("sum="+s);
    }
}


