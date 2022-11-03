import java.util.Scanner;

public class PalindromeNumber {
    static void checkPalindrome() {
        int r, sum = 0, temp;
        System.out.println("Enter Number :");

        Scanner num1 = new Scanner(System.in);

        int a = num1.nextInt();

        temp = a;

        while (a > 0) {

            r = a % 10;
            sum = (sum * 10) + r;
            a = a / 10;
        }

        if (sum == temp) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
