package com.company;
import java.util.Scanner;

 public class Anagrams {
     //function to calculate minimum number of Characters to be removed to make a string anagram
     static int checkAnagrams(String str1, String str2) {
         //make hash array for both the Strings and calculate Frequency of each Character
         int count1[] = new int[26];
         int count2[] = new int[26];
         //Count Frequency of string1
        /* -a because,
        'a' to 'z' would be 26 characters with ASCII values ranging from 97 to 122.
        Now, since we are storing the count of occurrence of each character in an
        array with index ranging from 0 to 25, we subtract 'a' from each character.
For example,
         'b' - 'a' would give 1 as 'b' has ASCII value 98 and 'a' has ASCII value 97.
          Therefore, 'b'-'a' in a place where integer is expected would give 1 and
          count1[1] or count2[1] would be incremented.
          */
         for (int i = 0; i < str1.length(); i++)
             count1[str1.charAt(i) - 'a']++;
         //count frequency of string2
         for (int i = 0; i < str2.length(); i++)
             count2[str1.charAt(i) - 'a']++;
         //traverse count arrays to find number of characters t be removed
         int result = 0;
         for (int i = 0; i < 26; i++)
             result += Math.abs(count1[i] - count2[i]);
         return result;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                 String str1 = sc.next();
                 String str2 = sc.next();
                 System.out.println(checkAnagrams(str1, str2));

             }
         }
     }


















