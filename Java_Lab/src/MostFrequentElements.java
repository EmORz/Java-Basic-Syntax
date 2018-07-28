package com.company;
import java.util.*;

public class MostFrequentElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i: sequence
             ) {

            if (!counts.containsKey(i)){
                counts.put(i, 0);
            }else {
                counts.put(i, counts.get(i)+1 );
            }
        }

        int max = 1;
        int bestKey= sequence[0];

        for (int num:sequence
             ) {
            if (max < counts.get(num)){
                max = counts.get(num);
                bestKey = num;
            }
        }
        System.out.println(bestKey);

    }


}
