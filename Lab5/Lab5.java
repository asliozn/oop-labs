package Lab5;

import java.util.Scanner;

public class Lab5<ort, count> {
    public static void main(String[] args) {

        int i = 1, j, count = 0;
        int ort = 0;
        Scanner values = new Scanner(System.in);

        while (i < 2) {

            System.out.println("Please write a number! --- If you want to exit press 0---");
            int number = values.nextInt();
            if (number == 0) {
                break;
            } else {
                ort += number;
                count++;
            }


        }
        if (count != 0) {
            System.out.println((float) ort / (float) count);
        }

        //WORK 2
        int[] A = new int[10];
        int c = 0, t = 0;
        int idx[] = new int[10];
        System.out.print("Write your array's values \n");

        for (j = 0; j < 10; j++) {
            idx[j] = j;
        }
        for (j = 0; j < 10; j++) {

            A[j] = values.nextInt();
        }
        for (j = 0; j < 10; j++) {

            if (idx[j] % 2 == 0) {
                c++;
            } else {
                t++;
            }
        }
        //Atama
        int[] C = new int[c];
        int[] T = new int[t];
        int k = 0, h = 0;
        for (j = 0; j < 10; j++) {

            if (idx[j] % 2 == 0) {
                C[k] = A[j];
                k++;
            } else {
                T[h] = A[j];
                h++;
            }
        }
        //Yazdırma
        System.out.print("B: ");
        for (j = 0; j < 10; j++) {

            System.out.print(" " + A[j]);
        }
        System.out.print("\nC: ");
        for (j = 0; j < c; j++) {

            System.out.print(" " + C[j]);
        }
        System.out.print("\nT: ");
        for (j = 0; j < t; j++) {

            System.out.print(" " + T[j]);
        }


    }
}