package com.company;

import java.util.Scanner;

public class SumOfSqOfArray {
    public static void main(String[ ]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int N=sc.nextInt();
        int arr[]=new int[N];
        int sum=0;
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
            sum+=arr[i]*arr[i];
        System.out.println(sum);
        sc.close();
    }
}




