package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class ArraycopyOf {

    public static void main(String [] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = Arrays.copyOf(array1,3);
        for (int number :array2){
            System.out.println(number);
        }



    }


    }
