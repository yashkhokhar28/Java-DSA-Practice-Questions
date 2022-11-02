import java.util.Scanner;

public class AreaOfCricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int radius = sc.nextInt();
        System.out.println("Area Of Cricle Having Radius " + radius + " Is " + Math.PI * radius * radius);
    }
}
