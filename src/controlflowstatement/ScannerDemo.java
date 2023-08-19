package controlflowstatement;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter value:");
        i=scanner.nextInt();

        System.out.println("enter value:");
        j=scanner.nextInt();

        System.out.println("value="+i+" " +"value="+j);

    }
}
