import java.util.Scanner;

/*7. To calculate Fibonacci Series up to n numbers.*/

public class FibonacciSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number1 = 0;
        int number2 = 1;
        System.out.print(number1 + " " + number2);
        for (int i = 2; i < n; i++) {
            int number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
