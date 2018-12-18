package com.company;

import java.util.Scanner;

public class SeatArrangement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int seat=s.nextInt();
            int ch=seat%12;
            switch(ch)
            {
                case 0 :
                    seat-=11;
                    System.out.println(seat+" WS");
                    break;
                case 1:
                    seat+=11;
                    System.out.println(seat+" WS");
                    break;
                case 2:
                    seat+=9;
                    System.out.println(seat+" MS");
                    break;
                case 3:
                    seat+=7;
                    System.out.println(seat+" AS");
                    break;
                case 4:
                    seat+=5;
                    System.out.println(seat+" AS");
                    break;
                case 5:
                    seat+=3;
                    System.out.println(seat+" MS");
                    break;
                case 6:
                    seat+=1;
                    System.out.println(seat+" WS");
                    break;
                case 7:
                    seat-=1;
                    System.out.println(seat+" WS");
                    break;
                case 8:
                    seat-=3;
                    System.out.println(seat+" MS");
                    break;
                case 9:
                    seat-=5;
                    System.out.println(seat+" AS");
                    break;
                case 10:
                    seat-=7;
                    System.out.println(seat+" AS");
                    break;
                case 11:
                    seat-=9;
                    System.out.println(seat+" MS");
            }
        }

    }
}