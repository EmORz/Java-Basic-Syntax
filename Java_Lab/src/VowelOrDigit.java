package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);
        char[] vowels = {'a', 'A', 'e', 'E', 'o', 'O', 'u', 'U', 'i', 'I'};
        boolean check = isVowel(vowels, ch);

        if (check){
            System.out.println("vowel");
        }else if (ch>=47 && ch<=57){
            System.out.printf("digit");
        }else {
            System.out.printf("other");
        }



    }

    protected static boolean isVowel(char[] vowels, char ch) {
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]){
                return true;
            }
        }

        return false;

    }
}
