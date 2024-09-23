public class HomeWork_9 {
    public static void main(String[] args) {
        // 1. Write a program that finds the maximum and the minimum value of an integer array.


        int[] numbers = {3, 5, 45, 2, 1, 67, 7};
        int maxValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        System.out.println("The max value is " + maxValue);


    }
}
