package com.company;
import java.util.Scanner;
public class AliAndHelpingPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(2) == 'A' || s.charAt(2) == 'E' || s.charAt(2) == 'I' || s.charAt(2) == 'O' || s.charAt(2) == 'U' || s.charAt(2) == 'Y') {
            System.out.println("INVALID");
        } else {
            if (((s.charAt(0) + s.charAt(1)) % 2 == 0) && ((s.charAt(3) + s.charAt(4)) % 2 == 0) && ((s.charAt(4) + s.charAt(5)) % 2 == 0) && ((s.charAt(7) + s.charAt(8)) % 2 == 0)) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}



//12X345-67



