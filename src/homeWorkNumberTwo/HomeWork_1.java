package homeWorkNumberTwo;

public class HomeWork_1 {

    public static void main(String[] args) {
    /*

    Write a program that given a 2D array prints it in reverse waveform.
    Example:
    Input: 123
           456
           789
    Output: 369852147

     */

       int [] [] lists = {{20,15,7},
                          {8,7,19},
                          {7,13,47}};

       for (int i = 2; i > 0; i--) {

            for (int j = 0; j < 3; j ++) {
                System.out.println(lists[j][i]);
            }
        }

    }
}
