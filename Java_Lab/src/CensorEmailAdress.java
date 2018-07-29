package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CensorEmailAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String text = scan.nextLine();

        String censorMails = CensorMail(email);
        String censora = text.replace(email, censorMails);

        System.out.println(censora);



    }

    private static String CensorMail(String email) {
        StringBuilder sb = new StringBuilder(email.length());
        int index = email.indexOf('@');

        for (int i = 0; i < index; i++) {
            sb.append('*');
        }
        sb.append(email.substring(index));

        return sb.toString();
    }
}
