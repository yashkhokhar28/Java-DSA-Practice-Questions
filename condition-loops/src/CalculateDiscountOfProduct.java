import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product's Origional Price : ");
        int price = sc.nextInt();
        System.out.println("Enter Discount Percentage : ");
        int percentage = sc.nextInt();
        System.out.println("Discount : " + (price * percentage) / 100);
    }
}
