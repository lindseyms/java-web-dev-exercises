package exercises.lesson2;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        //print even numbers
        ArrayList<Integer> numList = new ArrayList<>();
        Collections.addAll(numList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(calculateSum(numList));

        //print n-letter words
        ArrayList<String> listOfWords = new ArrayList<>();
        Collections.addAll(listOfWords, "ability", "able", "about", "above", "accept", "according", "account", "across",
                "act", "action", "activity", "actually", "add", "address", "administration", "admit", "adult");
        printWordsByLength(listOfWords);

        //print arraylist words from string
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String str[] = phrase.split(" ");
        List<String> wordsFromPhrase = Arrays.asList(str);
        printWordsByLength(wordsFromPhrase);
    }

    public static int calculateSum(ArrayList<Integer> nums){
        int sum = 0;

        for(int number : nums){
            if(number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }

    public static void printWordsByLength(List<String> listOfWords){
        Scanner reader = new Scanner(System.in);
        int lengthOfWord;
        System.out.println("How many letters in the word? ");
        lengthOfWord = reader.nextInt();

        for(String word : listOfWords){
            if(word.length() == lengthOfWord){
                System.out.println(word);
            }
        }
    }
}
