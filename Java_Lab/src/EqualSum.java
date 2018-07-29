package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int leftSum =0;
        int rightSum = 0;
        int checker =0;

        for (int i = 0; i < sequence.length; i++) {

            for (int j = 0; j < i; j++) {
                leftSum +=sequence[j];
            }
            for (int k = i+1; k < sequence.length; k++) {
                rightSum +=sequence[k];
            }
            if (leftSum!=rightSum){
                leftSum =0;
                rightSum =0;
            }else {
                System.out.println(i);
                checker++;
            }
        }
        if (checker==0){
            System.out.println("no");
        }
    }
}
