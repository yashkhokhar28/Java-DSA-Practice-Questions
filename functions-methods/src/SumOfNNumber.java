import java.util.Scanner;

public class SumOfNNumber {
    static int sum(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Nmuber : ");
        int number = sc.nextInt();
        int sum = sum(number);
        System.out.println("Sum Is : " + sum);
    }
}
