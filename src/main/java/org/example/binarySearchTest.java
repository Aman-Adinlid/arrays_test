package org.example;

import java.util.Arrays;

public class binarySearchTest {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};
        Arrays.sort(numbers);
        int indexFound = Arrays.binarySearch(numbers, 100);
        System.out.println(indexFound);
        System.out.println(Arrays.binarySearch(numbers, 300));

        int indexNotFound = Arrays.binarySearch(numbers, 600);

        System.out.println(indexNotFound);
    }
}
