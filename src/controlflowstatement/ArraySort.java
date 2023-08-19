package controlflowstatement;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter No of Elements:");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter array Elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}