import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Total Surface Area Of Cube Having Hight Radius " + radius + " Is " + 6 * Math.pow(radius, 2));
    }
}
