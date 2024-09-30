package homeWorkNumberTwo;

public class HomeWork_2 {
    public static void main(String[] args) {

    /*
    Write a method(s) sum() such that depending on the parameter types performs appropriate
    operations. If the input parameters are strings, print their concatenation. If they are integers, print
    their sum.
    Example:
    Method call: sum(“aa”. “bb”) returns: “aabb”
    Method call: sum(1, 1) returns: 2
     */

        System.out.println(sum("text1","text2"));
        System.out.println(sum(3,4));
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum(String a, String b) {
        return a + b;
    }
}