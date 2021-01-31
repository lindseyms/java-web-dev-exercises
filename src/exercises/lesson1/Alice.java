package exercises.lesson1;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String term;
        String firstPart;
        String secondPart;
        int indexOfTerm;
        int lengthOfTerm;

        System.out.print("Search term: ");
        term = reader.nextLine();

        if (sentence.toLowerCase().contains(term.toLowerCase())) {
            System.out.println("The term " + (char)34 + term + (char)34 + " was found!");

            indexOfTerm = sentence.toLowerCase().indexOf(term.toLowerCase());
            lengthOfTerm = term.length();
            System.out.println("The index is: " + indexOfTerm +" and its length is: " + lengthOfTerm);

            firstPart = sentence.substring(0, indexOfTerm);
            secondPart = sentence.substring(indexOfTerm+lengthOfTerm);
            System.out.println(firstPart + secondPart);
        } else {
            System.out.println("The term " + (char)34 + term + (char)34 + " was NOT found!");
        }



    }
}
