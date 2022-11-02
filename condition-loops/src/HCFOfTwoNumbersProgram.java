import java.util.Scanner;

public class HCFOfTwoNumbersProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, gcd = 0;
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();
        int result = Math.min(number1, number2); // Find Minimum of a nd b
        while (result > 0) {
            if (number1 % result == 0 && number2 % result == 0) {
                break;
            }
            result--;
        }
        System.out.println("HCF : " + result);
    }
}
