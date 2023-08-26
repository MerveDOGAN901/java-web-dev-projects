package org.example;
import java.util.Arrays;

public class StringArrayExercise {
        public static void main(String[] args) {
            String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

            // Splitting the phrase into words
            String[] words = phrase.split(" ");
            System.out.println("Words: " + Arrays.toString(words));

            // Splitting the phrase into sentences
            String[] sentences = phrase.split("\\.");
            System.out.println("Sentences: " + Arrays.toString(sentences));
        }
    }
