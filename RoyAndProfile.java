package com.company;

import java.util.Scanner;

public class RoyAndProfile {
    public static void main(String[] args) {


            //Scanner
            Scanner s = new Scanner(System.in);
            int L, H, W, N, i;
            L = s.nextInt();
            N = s.nextInt();
            for (i = 1; i <= N; i++) {
                W = s.nextInt();
                H = s.nextInt();
                if (W < L || H < L)
                    System.out.println("UPLOAD ANOTHER");
                else if (W == H)
                    System.out.println("ACCEPTED");
                else
                    System.out.println("CROP IT");
            }

        }
    }