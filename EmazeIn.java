package com.company;

import java.util.Scanner;

public class EmazeIn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
        char movement=s.charAt(i);
        switch (movement){
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;

            case'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            }
        }
        /*{
            if (s[i]=='L'){
                x--;
            }
            else if (s[i]=='R'){
                x++;
            }
            else if(s[i]=='U'){
                y++;
            }
            else if (s[i]=='D'){
                y--;
            }
        }*/
        System.out.println(x+" "+y);
    }

    }

