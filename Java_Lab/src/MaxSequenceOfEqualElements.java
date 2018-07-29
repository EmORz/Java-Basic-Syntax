package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> counts = new HashMap<>();
        int maxLen = 1;
        int maxNum = 0;
        int lenght = 1;

        for (int i = 0; i < sequence.length; i++) {
            if (i>0 &&(sequence[i] == sequence[i-1])){

                lenght++;
                if (lenght > maxLen ){
                    maxLen = lenght;
                    maxNum = sequence[i];
                }
            }else {

                lenght=1;
            }
        }

        if (maxLen !=1){
            for (int i = 0; i < maxLen; i++) {
                System.out.print(maxNum+" ");
            }

        } else {
            System.out.println(sequence[0]);
        }

        
    }
    
    
}
