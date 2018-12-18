package com.company;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (i = 0; i < 4; i++)
            sum += arr[i];
        System.out.println(sum);
        sc.close();
    }
}




