package org.example;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Scanner;
public class SortTest {

    // public static void main(String[] arg) {
    String[] names = {"aman", "sarah", "London", "Sweden"};
    // Arrays.sort(names);
    // for (String name : names) {
    //System.out.println(name);

    public static void main(String[] args) {
        String[] names = {"aman", "sarah", "London", "Sweden"};
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (String name : names) {
            System.out.println(name);
        }
    }
}