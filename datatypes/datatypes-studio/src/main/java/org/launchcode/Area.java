package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        input.close();
    }

    public static class Circle {
        public static Double getArea(Double radius){
            double PI = 3.14;
            return PI * radius * radius;

        }
    }
}
