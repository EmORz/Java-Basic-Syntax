package com.company;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        char[] reversed = word.toCharArray();
        String newWord = "";
        for (int i = reversed.length-1; i >=0 ; i--) {
            newWord +=reversed[i];
        }
        System.out.println(newWord);
    }
}
