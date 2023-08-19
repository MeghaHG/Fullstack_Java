package controlflowstatement;

import java.util.Scanner;

public class GuessNo {

    public static void main(String[] args) {

        int num=0,gno;
        Scanner sc= new Scanner(System.in);

        gno =(int) (Math.random()*50)+1;

        do{
            System.out.println("enter no");
            num = sc.nextInt();

            if(gno>num){
                System.out.println("guess no is greater");
            } else if (gno<num) {
                System.out.println("guess no is smaller");
            }else {
                System.out.println("guess no is correct");
            }

        }while (gno != num);
    }
}
