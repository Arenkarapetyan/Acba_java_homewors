package HomeWorkNumberThree;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        /*\
        4. Given integers n and k write a function that returns the value of nk. Use two different recursive approaches.

         */
        int numberN,numberK;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Input number N of power");
        numberN =user_input.nextInt();
        System.out.println("Input number K of power");
        numberK = user_input.nextInt();
        int result = power(numberN,numberK);
        System.out.println("The result of first function " +result);
        int resultOfpower2 = power2(numberN,numberK);
        System.out.println("The result of second function " +resultOfpower2);
    }
    public static int power (int numberN, int numberK){
        if (numberK == 0) {
            return 1;
        }

        int x = power(numberN,numberK -1);
        int result = numberN * x;
        return result;
    }

    public static int power2 (int numberN, int numberK){
        if (numberK == 0){
            return 1;
        }
        return (numberN * power2(numberN,numberK-1));
    }



}
