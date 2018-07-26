package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String str = "";

        for (int i = 0; i < 3; i++) {
             str += input.nextLine();
        }
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB = strB.reverse();
        System.out.print(strB);
    }
}
