import java.util.Scanner;

/*Write a program to print the sum of negative numbers,
sum of positive even numbers and
the sum of positive odd numbers from a list of numbers (N) entered by the user.
 The list terminates when the user enters a zero.*/
public class SumOfDiffrentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sumOfNegative = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        while ((number = sc.nextInt()) != 0) {
            if (number < 0) {
                sumOfNegative = sumOfNegative + number;
            }
            if (number > 0) {
                if (number % 2 == 0) {
                    sumOfEven = sumOfEven + number;
                } else {
                    sumOfOdd = sumOfOdd + number;
                }
            }
        }
        System.out.println("sum of negative numbers : " + sumOfNegative);
        System.out.println("sum of positive even numbers : " + sumOfEven);
        System.out.println("sum of positive odd numbers : " + sumOfOdd);
    }
}
