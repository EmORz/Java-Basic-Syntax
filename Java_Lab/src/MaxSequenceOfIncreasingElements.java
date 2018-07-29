package com.company;

import java.util.*;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int bestPosition =0;
        int bestSeq = 1;
        int currentLen = 1;
        int currentStart = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > sequence[i-1]){
                currentLen++;
                if (currentLen>bestSeq){
                    bestSeq = currentLen;
                    bestPosition = currentStart;
                }
            }else {
                currentLen = 1;
                currentStart++;
                i = currentStart;

            }
        }

        for (int i = bestPosition ; i < bestPosition+bestSeq; i++) {
            System.out.print(sequence[i]+" ");
        }


    }
}
