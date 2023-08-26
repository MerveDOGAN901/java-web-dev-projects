package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(12);
        numbers.add(7);
        numbers.add(4);

        int evenSum = sumEven(numbers);
        System.out.println("Sum of even numbers: " + evenSum);

        String inputString = "apple,banana,orange,grape,pear,kiwi,melon";
        ArrayList<String> words = convertStringToArrayList(inputString);

        printWordsWithLength(words);
    }

    public static ArrayList<String> convertStringToArrayList(String input) {
        String[] splitArray = input.split(",");
        ArrayList<String> arrayList = new ArrayList<>();

        for (String item : splitArray) {
            arrayList.add(item);
        }

        return arrayList;
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String word : words) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}
