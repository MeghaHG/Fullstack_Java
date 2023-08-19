package controlflowstatement;

import java.util.Scanner;

public class PatternOfStars {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row and col");
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        for (int i = 1; i <=row; i++) {
//            for (int j = 1; j <= col; j++)
//                if((i==1 || i==col) || (j==1 || j==col))
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//
//            System.out.println();
//        }

        int i,j;
        for (i=0;i<=4;i++){
            for (j=0;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        int a,b;
        for (a=0; a<=4; a++){
            for (b=0; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }







    }

}
