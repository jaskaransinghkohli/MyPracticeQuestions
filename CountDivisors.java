package com.company;

import java.util.Scanner;

public class CountDivisors {
    static int countDivisibles(int l,int r,int k) {
        int counter = 0;
        for (int i = l;i <= r;i++)
            if (i % k == 0)
                counter++;
            return counter;


    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int r=sc.nextInt();
    int k=sc.nextInt();
    System.out.println(countDivisibles(l,r,k));
}
}

