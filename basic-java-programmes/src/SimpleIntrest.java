import java.util.Scanner;

/*3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.*/

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal : ");
        float principal = sc.nextFloat();
        System.out.println("Enter Interest Rate : ");
        float intrest = sc.nextFloat();
        System.out.println("Enter Time");
        float time = sc.nextFloat();
        System.out.println("Simple Intrest Is : " + (principal * intrest * time) / 100);
    }
}
