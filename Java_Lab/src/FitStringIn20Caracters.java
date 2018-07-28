package com.company;

import java.util.Scanner;

public class FitStringIn20Caracters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();
        String temp = "";

        for (int i = 0; i < 20; i++) {
                if (i >= input.length){
                    temp+="*";
                }else {
                    temp += input[i];
                }
        }
        System.out.println(temp);
    }
}
