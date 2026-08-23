package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void addItems(String item) {

        String[] items = item.split(",");

        for (String i : items) {
            String cleanItem = i.trim();
            if (!checkItemIsInList(cleanItem)) {
                groceryList.add(cleanItem);
                System.out.println(cleanItem + " added successfully.");
            } else {
                System.out.println(cleanItem + " already exists.");
            }
        }
        printSorted();
    }


    public static void removeItems(String input) {

        String[] items = input.split(",");
        for (String i : items) {
            String cleanItem = i.trim();
            if (checkItemIsInList(cleanItem)) {
                groceryList.remove(cleanItem);
                System.out.println(cleanItem + " removed successfully.");
            } else {
                System.out.println(cleanItem + " does not exist.");
            }
        }

        printSorted();
    }


    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        sortItems();
        System.out.println("Grocery List: " + groceryList);
    }

    private static void sortItems() {
        Collections.sort(groceryList);
    }


    public void startGrocery() {
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.print(
                    """
                            Welcome to Grocery!
                            Please select an option:
                            0 - Stop Application
                            1 - Add Item
                            2 - Remove Item
                            """
            );


            String optionStr = scanner.nextLine();

            switch (optionStr) {
                case "0":
                    scanner.close();
                    break label;
                case "1":
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemToAdd = scanner.nextLine();
                    addItems(itemToAdd);
                    break;
                case "2":
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemToRemove = scanner.nextLine();
                    removeItems(itemToRemove);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }


    }
}
