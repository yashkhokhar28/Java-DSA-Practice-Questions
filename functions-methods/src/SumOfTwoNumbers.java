import java.util.Scanner;

/*[Write a program to print the sum of two numbers entered by user by defining your own method.]
(https://code4coding.com/addition-of-two-numbers-in-java-using-method/)*/
public class SumOfTwoNumbers {
    static int Sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();
        int sum = Sum(number1, number2);
        System.out.println("Sum Is : " + sum);
    }
}
