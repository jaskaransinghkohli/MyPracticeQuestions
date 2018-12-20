/*Sample Input:
        3
        sumit mitsu
        ambuj jumba
        abhi hibb
        Sample Output:
        YES
        YES
        NO*/
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringIdentical {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N-->0){
            String s1=sc.next();
            String s2=sc.next();
            char[]c1=s1.toCharArray();
            char[]c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String s11= new String(c1);
            String s22=new String(c2);
            if(s11.equals(s22)){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}




