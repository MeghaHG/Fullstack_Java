package controlflowstatement;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Option 1 :: Addition");
        System.out.println("Option 2 :: Subtraction");
        System.out.println("Option 3 :: Multiplication");
        System.out.println("Option 4 :: Division");
        System.out.println("Option 5 :: Modulus");

        int c=sc.nextInt();
        float ans=0;

        switch (c){

            case 1 :
                c=a+b;
                System.out.println("Addition is:"+a+"+"+b+"="+c);
                break;

            case 2 :
                c=a-b;
                System.out.println("Subtraction is:"+a+"-"+b+"="+c);
                break;

            case 3 :
                c=a*b;
                System.out.println("Multiplication is:"+a+"*"+b+"="+c);
                break;

            case 4 :
                c=a%b;
                System.out.println("Division is:"+a+"%"+b+"="+c);
                break;

            case 5 :
                c=a/b;
                System.out.println("Modulus is:"+a+"/"+b+"="+c);
                break;

            default:
                System.out.println("invalid case");
        }

    }
}
