import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {

        // Write a program that takes as an input an integer n and an integer k and calculates n to the power
        // of k (usage of Math.pow() is not allowed).

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer ");
        int firstInt = scanner.nextInt();
        System.out.print("Input second integer ");
        int secondInt = scanner.nextInt();
        int result = 1;
        while (secondInt > 0){
            result = result * firstInt;
            secondInt -= 1;
        }
        System.out.println("The power result is " + result);

    }
}
