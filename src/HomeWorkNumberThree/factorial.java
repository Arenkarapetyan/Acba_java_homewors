package HomeWorkNumberThree;

public class factorial {
    public static void main(String[] args) {
        /*
        3. Factorial of a non-negative integer is a multiplication of all integers smaller than or equal to n.
         For example factorial of 6 is 6*5*4*3*2*1 which is 720. Write a function int fact(int n) that returns the
          factorial of n. Use recursion.
         */

        int res = factorial(5);
        System.out.println(res);

    }

    public static int factorial(int factor){

        if (factor < 1) {
            System.out.println("The factorial is negative number!");
            return factor;
        }
        if (factor == 1)
            return 1;
        return factorial(factor-1) * factor;
    }


}
