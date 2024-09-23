import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer ");
        int firstInt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input calculate operator key ");
        String operator = scanner.nextLine();
        System.out.print("Input second integer ");
        int secondInt = scanner.nextInt();



        switch (operator){
            case "+":
                System.out.println("The result is " + firstInt + "*" + secondInt + "=" + (firstInt +  secondInt));
                break;
            case "-":
                System.out.println("The result is " + firstInt + "*" + secondInt + "=" + (firstInt -  secondInt));
                break;
            case "*":
                System.out.println("The result is " + firstInt + "*" + secondInt + "=" + (firstInt *  secondInt));
                break;
            case "/":
                System.out.println("The result is " + firstInt + "/" + secondInt + "=" + (firstInt *  secondInt));
                break;
        }

    }
}
