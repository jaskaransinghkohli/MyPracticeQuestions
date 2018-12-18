package com.company;

import java.util.Scanner;

public class IntegerRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        for(int i=L;i<=R;i++)
            System.out.println(i+" ");
            System.out.println();
            sc.close();
    }
}
