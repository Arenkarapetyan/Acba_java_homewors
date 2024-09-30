package HomeWorkNumberOne;

import java.util.Scanner;

public class HomeWork_11 {
    public static void main(String[] args) {

    // 3. Write a program that finds all combinations of four elements of a given integer array, whose sum
        // is equal to the given value.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input index for remove ");
        int firstInt = scanner.nextInt();
        int[] numbers = {3, 5, 45, 2};

        for (int i = 0; i < numbers.length; i++) {

            for (int j =0; j < i; j++){
                if (numbers[i] + numbers[j] == firstInt){
                    System.out.println("This comb is equal " + numbers[i] +" + " +numbers[j]);

                }
            }


        }


    }
}
