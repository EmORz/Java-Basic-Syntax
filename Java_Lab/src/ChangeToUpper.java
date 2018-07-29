package com.company;

import java.util.Scanner;
import java.util.*;

public class ChangeToUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        while (true){
            int open = text.indexOf("<upcase>");
            int close = text.indexOf("</upcase>");
            if (open<0 || close<0){
                break;
            }
            String textReplace = text.substring(open, close+9);

            text = text.replace(textReplace, textReplace.substring(8, textReplace.length()-9).toUpperCase());

        }
        System.out.println(text);
    }
}
