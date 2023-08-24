package org.launchcode;
import java.util.Scanner;

    public class StringSearch {
        public static void main(String[] args) {
            String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a search term: ");
            String searchTerm = scanner.nextLine().toLowerCase();  // Convert the search term to lowercase

            boolean found = sentence.toLowerCase().contains(searchTerm);  // Perform case-insensitive search

            System.out.println("Search term found: " + found);

            scanner.close();

        }
    }

