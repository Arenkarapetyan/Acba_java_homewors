package HomeWorkNumberThree;

public class list_revers {
    public static void main(String[] args) {
        // 6. Given an array, write a function to print the elements of the given array in reversed order. Use recursion.
        System.out.println("Old array");

        int[] oldArray = {5, 3, 2, 1, 4};
        for (int digit : oldArray) {
            System.out.print(digit);
        }

        int[] newArray = new int[oldArray.length];

        reverseArray(oldArray, newArray, 0, oldArray.length - 1);

        System.out.println("New array");
        for (int digit : newArray) {
            System.out.print(digit);
        }
    }


    public static void reverseArray(int[] OldArray, int[] newArray, int start, int end) {
        if (start > end) {
            return;
        }

        newArray[start] = OldArray[end];
        newArray[end] = OldArray[start];

        reverseArray(OldArray, newArray, start + 1, end - 1);
    }
}

