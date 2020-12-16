package org.example;

import java.util.Scanner;


public class App {

    private String[] names = {"Aman","Adam","Jacob","Sam","smith"};

    public String findName(String NameToFind) {
        for (String name : names) {
            if (name.equalsIgnoreCase(NameToFind)) {
                return name;
            }
        }
       return  "Error: No match";

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search by name: ");
        String name = scanner.nextLine();

        App app = new App();
        String findName = app.findName(name);
        System.out.println(findName);
        System.out.println(app.findName("aman"));
        System.out.println(app.findName("adam"));
        System.out.println(app.findName("smith"));

    }
}
