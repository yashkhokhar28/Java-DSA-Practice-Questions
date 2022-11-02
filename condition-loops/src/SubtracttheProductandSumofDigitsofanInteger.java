import java.util.Scanner;

/*[Subtract the Product and Sum of Digits of an Integer]
(https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)*/

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n != 0) {
            sum += n % 10;
            product *= (n % 10);
            n = n / 10;
        }
        System.out.println((product - sum));
    }
}
