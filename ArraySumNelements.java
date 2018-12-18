package com.company;

import java.util.Scanner;

public class ArraySumNelements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int N=sc.nextInt();
        int arr[]=new int[N];
        int sum=0;
        System.out.println("Enter the values:");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
            sum+=arr[i];
        System.out.println(sum);
        sc.close();
    }
}
