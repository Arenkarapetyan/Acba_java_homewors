package HomeWorkNumberThree;

public class findSum {
    public static void main(String[] args) {
       // 8. Given a number n, find the sum of its digits. Use recursion.

        int number = 56;
        int sum = 0;


        while (number > 0){

            sum = sum + number % 10;

            number = number / 10;
        }
        System.out.println(sum);
    }

    public static int sumOfDigit (int number){

        if (number  == 0){
            return 0;
        }
        return number % 10 + sumOfDigit(number /10);
    }

}
