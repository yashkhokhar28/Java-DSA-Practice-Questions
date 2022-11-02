import java.util.Scanner;

/*8. To find out whether the given String is Palindrome or not.*/

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int length = string.length();
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        if (string.equals(reverseString)) {
            System.out.println(string + " Is  Palindrome String ");
        } else {
            System.out.println(string + " Is Not Palindrome String ");
        }
    }
}
