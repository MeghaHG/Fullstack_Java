package controlflowstatement;

import java.util.Scanner;

public class ArraySortSwap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter No of Elements");
        n=sc.nextInt();

        int a[] =new int[n];

        System.out.println("Enter array Elements:");

        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        int temp=0;
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sorted array elements:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
    }
}
