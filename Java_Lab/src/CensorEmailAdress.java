package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CensorEmailAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String text = scan.nextLine();

        String[] parts = text.split(" ");


        for (String str: parts
             ) {
            System.out.println(str);
        }

    }
}
