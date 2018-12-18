package com.company;

import java.util.Scanner;

public class SumOf2Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Reading integer from input
        int N = sc.nextInt();

        int[] numArrayA = new int[N];
        int[] numArrayB = new int[N];
        int[] sumArray = new int[N];

        // Read numArray1
        for(int i=0; i<N; i++) {
            numArrayA[i] = sc.nextInt();
        }
        // Read numArray2
        for(int i=0; i<N; i++) {
            numArrayB[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        sumArray[i]=numArrayA[i]+numArrayB[i];
        for(int i=0;i<N;i++) {
            System.out.println(sumArray[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}







