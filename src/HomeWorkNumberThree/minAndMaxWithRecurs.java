package HomeWorkNumberThree;

public class minAndMaxWithRecurs {
    public static void main(String[] args) {
          /*
    5. Given an array, write functions to find the minimum and the maximum elements in it. Use recursion.

     */

        int[] arry = {1, 3, 4, 5, 34, 53, 2};
        System.out.println("The max value in array is " + minAndMax(arry, 0));
    }

    public static int minAndMax(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }
        int max = arr[index];
        int resOfMax = minAndMax(arr, index + 1);
        if (resOfMax > max) {
            max = resOfMax;
        }
        return max;
    }
}

