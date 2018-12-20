package com.company;

import java.util.Scanner;

public class BricksGame {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int totalBricks = s.nextInt();
        String lastMan = "";

        int n = totalBricks;

        for(int i=1; i <= totalBricks && n > 0; i++){
            if(n > 0){
                n -= i;
                lastMan = "Patlu";
            }
            if(n > 0){
                n -= i*2;
                lastMan = "Motu";
            }
        }
        System.out.println(lastMan);
    }
}


