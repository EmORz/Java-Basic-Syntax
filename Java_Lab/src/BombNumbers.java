package com.company;

import java.util.Scanner;
import java.util.*;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] bombData = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int powerBomb = bombData[1];
        int positionBomb = bombData[0];

        ArrayList<Integer> remainingSeq = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            remainingSeq.add(sequence[i]);
        }


        while (remainingSeq.indexOf(positionBomb)!=-1){
            int bombIndex = remainingSeq.indexOf(positionBomb);
            int bombStartInd = Math.max(0, bombIndex-powerBomb);
            int bombEndUnd = Math.min(bombIndex+powerBomb, remainingSeq.size()-1);

            for (int i = bombStartInd; i <= bombEndUnd; i++) {
                remainingSeq.remove(bombStartInd);
            }
        }
        int sumOfLiveElements = 0;

        for (int s: remainingSeq
             ) {
            sumOfLiveElements+=s;
        }
        System.out.println(sumOfLiveElements);





    }
}
