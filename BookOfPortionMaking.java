package com.company;

import java.util.Scanner;

public class BookOfPortionMaking {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(((s.charAt(0)*1)+(s.charAt(1)*2)+(s.charAt(2)*3)+(s.charAt(3)*4)+(s.charAt(4)*5)+(s.charAt(5)*6)+(s.charAt(6)*7)+(s.charAt(7)*8)+(s.charAt(8)*9)+(s.charAt(9)*10))%11==0){
            System.out.println("Legal ISBN");
        }
        else if(((s.charAt(0)*1)+(s.charAt(1)*2)+(s.charAt(2)*3)+(s.charAt(3)*4)+(s.charAt(4)*5)+(s.charAt(5)*6)+(s.charAt(6)*7)+(s.charAt(7)*8)+(s.charAt(8)*9)+(s.charAt(9)*10))%11!=0){
            System.out.println("Illegal ISBN");
        }


    }
}
