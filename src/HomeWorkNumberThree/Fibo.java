package HomeWorkNumberThree;

public class Fibo {

    public static void main(String[] args) {

        /*

    2. The Fibonacci numbers are the numbers in the following integer sequence.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
    In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence
    relation:
         */

       int results =  fibonacci(8);
        System.out.println(results);
    }
    public static int fibonacci (int fib ){
        if (fib == 0)
            return 0;
        else if (fib == 1)
            return 1;
        return fibonacci(fib-1) + fibonacci(fib-2);
    }
}
