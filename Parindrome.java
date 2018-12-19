package com.company;

import java.util.Scanner;

public class Parindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String reverse="";
        System.out.println("Enter the string");
        String original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--){    //-1 because we are taking the values from the back
            reverse+=original.charAt(i);

        }
        if(original.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
