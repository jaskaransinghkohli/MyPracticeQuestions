package com.company;

import java.util.Scanner;

public class Duration {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int SH=sc.nextInt();
            int SM=sc.nextInt();
            int EH=sc.nextInt();
            int EM=sc.nextInt();
            int start_time=SH*60+SM;
            int end_time=EH*60+EM;
            int total_time=end_time-start_time;
            int minute=total_time%60;
            int hours=total_time/60;
            System.out.println(hours+" "+minute);
        }
    }
}
