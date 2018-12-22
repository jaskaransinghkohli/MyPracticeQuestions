package com.company;

import java.util.Scanner;

public class Ladderophilia {
    public static void main(String[]args){
        int num,i=0;
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        while(i<=num && (num>=1 &&num<=45))
        { System.out.println("*   *");
            System.out.println("*   *");
            if(i<num)
            {
                System.out.println("*****");
            }
            i++ ;
        }
    }
}




