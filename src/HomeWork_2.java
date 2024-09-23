import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {

   //  Write a program that takes as an input an integer representing the year and determines whether it is a
  //  leap year//  . A leap year is exactly divisible by 4 except for century years (years ending with 00). A century
        //  year is a leap year only if it is perfectly divisible by 400.

        Scanner inputYear = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = inputYear.nextInt();


        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("The year is leap");
        }
        else if (year % 400 == 0){
            System.out.println("The year is leap");
        }
        else System.out.println("The year is NOT leap");

    }
}
