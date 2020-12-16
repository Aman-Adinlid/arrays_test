package org.example;
import java.util.Scanner;
public class TowDimArray {
    public static void main(String[] args) {
        int[][] numbers = new int[4][4];
        numbers[0][0] = 1;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);

                if (j == numbers[i].length - 1) {
                    System.out.println();
                }

            }
        }
    }
}
