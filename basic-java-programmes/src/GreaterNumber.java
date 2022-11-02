import java.util.Scanner;

/*5. Take 2 numbers as input and print the largest number.*/

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " Is Greater Than " + number2);
        }
        if (number2 > number1) {
            System.out.println(number2 + " Is Greater Than " + number1);
        }
    }
}
