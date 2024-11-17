package HomeWorkNumberThree;

public class StringPalindrome {
    //Given a string, write a function to check if it is palindrome or not. A string is said to be palindrome if the
    // reverse of the string is the same as string. For example, "abba" is a palindrome, but “abbc" is not a palindrome
        public static void main(String[] args) {
            String palin = "abba";


            palidnrom(palin,0,palin.length()-1);
        }

    public static void palidnrom(String input,int start, int end){
            if (start > end){
                System.out.println("is palindrome");
                return;
            }
            if (input.charAt(start) != input.charAt(end)) {
                System.out.println("no palindrome");
                return;
            }

            palidnrom(input,start+1,end-1);



    }
}
