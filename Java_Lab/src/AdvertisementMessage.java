package com.company;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can't live without this product."};
        String[] events =  {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author ={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities ={"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int num = scanner.nextInt();
        Random rnd = new Random();
        String getRandomData = getGetRandomData(phrases, rnd);
        for (int i = 0; i < num; i++) {
            String message = getGetRandomData(phrases, rnd)+" "+getGetRandomData(events, rnd)+" " +
                    getGetRandomData(author, rnd)+" "+getGetRandomData(cities, rnd);
            System.out.println(message);
        }

    }

    private static String getGetRandomData(String[] temp, Random rnd) {

        int randomNum = rnd.nextInt(temp.length);
        String getData = temp[randomNum];
        return getData;
    }
}
