import java.util.Scanner;

public class LCMOfTwoNumbers {
    Scanner sc = new Scanner(System.in);

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
    }
}
