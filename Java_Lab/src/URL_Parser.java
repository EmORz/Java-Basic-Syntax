package com.company;

import java.util.Scanner;

public class URL_Parser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //http://www.abc.com/video

        String input = scan.nextLine();
        String protocol = "";
        String server = "";
        String resource = "";

        int procolIndex = input.indexOf("://");

        if (procolIndex !=-1){
            protocol = input.substring(0, procolIndex);
            input = input.substring(procolIndex+3);
        }

        int serverIndex = input.indexOf("/");

        if (serverIndex !=-1){
            server = input.substring(0, serverIndex);
            resource = input.substring(serverIndex+1);
        }else {
            server = input;
        }


        System.out.printf("[protocol] = \"%s\"\n", protocol);
        System.out.printf("[server] = \"%s\"\n", server );
        System.out.printf("[resource] = \"%s\"\n", resource);



//                [protocol] = "http"
//                [server] = "www.abc.com"
//                [resource] = "video"

    }
}
