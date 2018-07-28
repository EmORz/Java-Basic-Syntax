package com.company;

import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] chArr = scan.nextLine().toLowerCase().toCharArray();

        for (char ch: chArr
             ) {
            System.out.printf("%s -> %d\n", ch, Character.getNumericValue(ch)-Character.getNumericValue('a'));
        }
    }
}