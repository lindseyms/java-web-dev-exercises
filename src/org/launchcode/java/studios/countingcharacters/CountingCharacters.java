package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

import java.util.Scanner;

public class CountingCharacters {


    public static void main(String[] args) {
        HashMap<Character, Integer> charactersMap = new HashMap<>();
        char[] quote;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = reader.nextLine().replaceAll("[^a-zA-Z]", "");
        quote = input.toLowerCase().toCharArray();

        for(char letter : quote){

            if(charactersMap.containsKey(letter)) {
               int value = charactersMap.get(letter);
                value++;
                charactersMap.replace(letter, value);
            }
            charactersMap.putIfAbsent(letter, 1);
        }

        System.out.println(charactersMap);

    }

}
