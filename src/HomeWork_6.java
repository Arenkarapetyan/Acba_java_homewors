import java.util.Scanner;

public class HomeWork_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer ");
        int firstInt = scanner.nextInt();
        int a = 0;
        int b = 1;
        int result = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= firstInt ; i++) {
            result = a + b;
            System.out.println(result);
            a=b;
            b=result;
        }
    }
}
