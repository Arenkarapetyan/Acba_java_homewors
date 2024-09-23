import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer ");
        int firstInt = scanner.nextInt();
        int savedNumber = firstInt;
        int result = 0;

        while (firstInt > 0){
            int lastNumber = firstInt % 10;
            System.out.println(firstInt);
            result = result + lastNumber * lastNumber * lastNumber;
            firstInt = firstInt / 10;
        }

        if (result == savedNumber){
            System.out.println("The number is Armstrong");
        }else
            System.out.println("The number is not Armstrong");

    }
}
