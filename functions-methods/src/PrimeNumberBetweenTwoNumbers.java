import java.util.Scanner;

/*[Write a function that returns all prime numbers between two given numbers.]
(https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)*/
public class PrimeNumberBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt();
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0) continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) System.out.println(i);
        }
    }
}
