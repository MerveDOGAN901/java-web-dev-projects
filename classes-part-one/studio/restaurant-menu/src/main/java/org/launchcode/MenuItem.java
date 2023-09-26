package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;


    public MenuItem(String name, String description, double price, String category, LocalDate dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public LocalDate getDateAdded() {

        return dateAdded;
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
    }
    public String toString() {
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
    }

    public String toString() {
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : MenuItem) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
    }
}