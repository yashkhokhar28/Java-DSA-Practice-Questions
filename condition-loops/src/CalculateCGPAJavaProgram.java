import java.util.Scanner;

public class CalculateCGPAJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Subject : ");
        int number = sc.nextInt();
        int subject = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println("Enter " + i + " Subject Marks : ");
            subject = sc.nextInt();
            sum = sum + subject;
        }
        System.out.println("Avarage = " + sum / number);
    }
}
