import java.util.Scanner;

/*4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)*/

public class OperatorCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter Operator : ");
        String operator = sc.next();
        if (operator.equals("+")) {
            System.out.println("Addition Of " + number1 + " And " + number2 + " Is " + (number1 + number2));
        }
        if (operator.equals("-")) {
            System.out.println("Subtraction Of " + number1 + " And " + number2 + " Is " + (number1 - number2));
        }
        if (operator.equals("*")) {
            System.out.println("Multiplication Of " + number1 + " And " + number2 + " Is " + (number1 * number2));
        }
        if (operator.equals("/")) {
            System.out.println("Division Of " + number1 + " And " + number2 + " Is " + (number1 / number2));
        }
    }
}
