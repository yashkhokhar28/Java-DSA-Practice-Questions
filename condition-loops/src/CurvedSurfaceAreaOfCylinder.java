import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter Value Of Hight : ");
        int hight = sc.nextInt();
        System.out.println("Curved Surface Area Of Cylinder Having Hight " + hight + " And Radius " + radius + " Is " + 2 * Math.PI * radius * hight);
    }
}
