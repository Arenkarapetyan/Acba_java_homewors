import java.util.Scanner;

public class HomeWork_10 {
    public static void main(String[] args) {

     //2. Write a program that removes the given element from an array Example:Initial array: [1][2][3][4] Remove: 2
     // Final array: [1][3][4][ ]
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input index for remove ");
        int firstInt = scanner.nextInt();
        int [] newArray = new int [7];

        int[] numbers = {3, 5, 45, 2, 1, 67, 7};

        for (int i = 0; i < numbers.length; i++) {

            if (firstInt == i){
                continue;
            }
            newArray[i] = numbers[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
}
