package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        System.out.println("Enter string");
        String value=sc.next();
        System.out.println("Number="+ num*2);
        System.out.println("String="+ value);
    }
}
