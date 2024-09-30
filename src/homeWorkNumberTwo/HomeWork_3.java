package homeWorkNumberTwo;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {

        /*
        Write a program that generates a random number in the range [0, n] and asks the user to guess what the number
         is. If the user's guess is higher than the random number, the program should display "Too high, try again."
          If the user's guess is lower than the random number, the program should display "Too low, try again."
           The program should use a loop that repeats until the user correctly guesses the random number.
           Now switch the sides: you are choosing a random number, and the program should guess it.
         */
        Random random = new Random();
        int randomNumber = random.nextInt(Integer.MAX_VALUE);
        System.out.println(randomNumber);
        Scanner user_input = new Scanner(System.in);
        int user_inputNumber = -1;
        int exit_condition = -2;


        while (user_inputNumber != randomNumber) {

            System.out.println("Guess the number");
            user_inputNumber = user_input.nextInt();


            if (user_inputNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (user_inputNumber > randomNumber) {
                System.out.println("Too high, try again.");
            }

        }
        System.out.println("You are choosing a random number");

    }
}


