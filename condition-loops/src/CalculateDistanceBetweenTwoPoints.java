import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 coordinate : ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 coordinate : ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 coordinate : ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 coordinate : ");
        int y2 = sc.nextInt();
        System.out.println("Distance : " + Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }
}
