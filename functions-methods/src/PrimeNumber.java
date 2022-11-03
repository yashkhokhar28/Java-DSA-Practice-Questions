import java.util.Scanner;

/*[Define a method to find out if a number is prime or not.]
(https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)
 */

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int number1 = sc.nextInt();
        boolean ans = isPrime(number1);
        System.out.println(ans);
    }
}
