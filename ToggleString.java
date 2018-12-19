package com.company;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 123) {
                System.out.print(Character.toString((char) (ch - 32)));
            } else if (ch >= 65 && ch <= 96) {
                System.out.print(Character.toString((char) (ch + 32)));
            }
        }

    }
}


