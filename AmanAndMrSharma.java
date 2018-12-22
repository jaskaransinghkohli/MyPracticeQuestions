package com.company;

import java.util.Scanner;

public class AmanAndMrSharma {
    public static void main(String[] args) {
        int tofee = 0, r, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int d = sc.nextInt();

        for (int i = 0; i < d; i++) {
            r = sc.nextInt();

            x = sc.nextInt();

            int distance_covered = 100 * x;
            double area_of_circle = (2 * (22 / 7) * r);
            if (distance_covered >= area_of_circle) {
                tofee++;
            }
        }

                System.out.println(tofee + "");
            }
        }






