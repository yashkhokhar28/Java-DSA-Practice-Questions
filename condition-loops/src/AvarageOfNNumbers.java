import java.util.Scanner;

public class AvarageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Nmuber : ");
        int number = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println("Avarage : " + (sum / count));
    }
}
