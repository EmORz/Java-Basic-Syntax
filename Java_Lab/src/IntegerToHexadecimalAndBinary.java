package com.company;

import java.util.Scanner;

public class IntegerToHexadecimalAndBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String convertHex = Integer.toHexString(number);
        String convertBinary = Integer.toString(number, 2);

        System.out.println(convertHex.toUpperCase());
        System.out.println(convertBinary);
    }
}
