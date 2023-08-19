package controlflowstatement;

import java.util.Scanner;

public class ArrayMultiplication {

    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Elements:");
        n=sc.nextInt();
        System.out.println("Enter No of Elements:");
        m=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter no of elements of first array:");

        for (int i=0;i<n; i++){
            a[i]=sc.nextInt();
        }

        int b[]=new int[m];
        System.out.println("Enter no of elements of second array:");

        for (int j=0;j<m; j++){
            b[j]=sc.nextInt();
        }


        int c[]= new int[a.length];
        for (int i = 0,j=b.length-1; i < a.length; i++,j--) {

               c[i]=a[i]*b[j];

        }

        System.out.println("Sorted array:");
        for (int i = 0; i < c.length; i++) {

            System.out.println(c[i]);
        }
    }
}
