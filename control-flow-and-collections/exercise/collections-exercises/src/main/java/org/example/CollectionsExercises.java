package org.example;

public class CollectionsExercises {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        System.out.println("All numbers:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int value : integerArray) {
            if (value % 2 == 1) {
                System.out.print(value + " ");
            }
        }
    }
}

