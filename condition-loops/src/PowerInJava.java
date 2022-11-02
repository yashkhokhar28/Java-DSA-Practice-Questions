import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int number = sc.nextInt();
        System.out.println("Square Of " + number + " Is " + Math.pow(number, 2));
    }
}
