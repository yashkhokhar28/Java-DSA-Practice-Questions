import java.util.*;

public class ArmstrongNumberBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial Number");
        int number1 = sc.nextInt();
        System.out.println("Enter Final Number");
        int number2 = sc.nextInt();
        for (int i = number1; i < number2; i++) {
            int check = 0, sum = 0, reminder = 0;
            check = i;
            while (check != 0) {
                reminder = check % 10;
                sum = sum + (reminder * reminder * reminder);
                check = check / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
