public class HomeWork_1 {
    public static void main(String[] args) {


//Write a program that takes as an input three numbers and prints "increasing" if the numbers are in increasing
// order, "decreasing" if the numbers are in decreasing order, and "neither" otherwise (use conditional operator).

        int one = 7;
        int two = 7;
        int three = 3;

        if (one >= two && two >= three){
            System.out.println("increasing numbers");
        }
        else if (one <= two && two <= three){
            System.out.println("decreasing");
        }
        else System.out.println("neither");


    }
}
