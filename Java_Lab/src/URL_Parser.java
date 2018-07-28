package com.company;

import java.util.Scanner;

public class URL_Parser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //http://www.abc.com/video

        String input = scan.nextLine();
        String[] parts = input.split("/");
        String[] part = input.split("\\.");
        String temporal = "";
        String resource = "";
        for (int i = 2; i < part.length; i++) {
            temporal+=part[i];
        }
        String[] temp = temporal.split("/");

        for (int i = 1; i < temp.length; i++) {
            if (i == temp.length-1){
                resource+=temp[i];
            }else {
                resource+=temp[i]+"/";
            }
        }

        char[] ch = input.toCharArray();
        int indexHttp = input.indexOf("://");
        int indexServer = input.indexOf("/");
        String protocol = "";
        for (int i = 0; i < indexHttp; i++) {
            protocol +=ch[i];
        }
        System.out.printf("[protocol] = \"%s\"\n", protocol);
        if (protocol.equals("")){
            System.out.printf("[server] = \"%s\"\n", parts[0].trim());

        }else {
            System.out.printf("[server] = \"%s\"\n", parts[2].trim());
        }
        System.out.printf("[resource] = \"%s\"", resource.trim() );



//                [protocol] = "http"
//                [server] = "www.abc.com"
//                [resource] = "video"

    }
}
