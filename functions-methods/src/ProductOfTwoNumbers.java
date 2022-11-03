import java.util.Scanner;

/*[Define a method that returns the product of two numbers entered by user.]
(https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)*/
public class ProductOfTwoNumbers {
    static int Product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();
        int product = Product(number1, number2);
        System.out.println("Product Is : " + product);
    }
}
