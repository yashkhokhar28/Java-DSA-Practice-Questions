import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price : ");
        int price = sc.nextInt();
        System.out.println("Enter Your Commision : ");
        int commision = sc.nextInt();
        System.out.println("Your Commision Rupee = " + (price * commision) / 100);
    }
}
