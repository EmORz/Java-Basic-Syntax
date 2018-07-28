package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String p = "<upcase>(.+?)<\\/upcase>";
        //Pattern pattern = Matcher();
        System.out.println(text);
    }
}
