package com.company;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new TreeMap<>();

        while (true){
            String[] inputData = scanner.nextLine().split(" ");
            if (inputData[0].equals("END")){
                break;
            }else if(inputData[0].equals("A")){
                phonebook.put(inputData[1], inputData[2]);
            }else if(inputData[0].equals("S")){

                if (phonebook.containsKey(inputData[1])){
                    System.out.printf("%s -> %s\n", inputData[1], phonebook.get(inputData[1]));
                }
                else {
                    System.out.printf("Contact %s does not exist.\n", inputData[1]);
                }
            }else if (inputData[0].equals("ListAll")){

                for (String k: phonebook.keySet()) {
                    System.out.println(k+" -> "+phonebook.get(k));

                }
            }

        }


    }
}
