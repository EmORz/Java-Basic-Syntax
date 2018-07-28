package com.company;

import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split("\\s");
        String[] arr2 = scanner.nextLine().split("\\s");

        if (arr1.length>arr2.length){
            String[] temporal = arr1;
            arr1 = arr2;
            arr2 = temporal;
        }else  if(arr1.length == arr2.length){
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i].charAt(0)> arr2[i].charAt(0)){
                    String[] temporal = arr1;
                    arr1 = arr2;
                    arr2 = temporal;
                    break;
                }
            }
        }
        getStringsArray(arr1);
        getStringsArray(arr2);
    }

    private static void getStringsArray(String[] temp) {
        for (String ch: temp
             ) {
            System.out.print(ch);
        }
        System.out.println();
    }


}
