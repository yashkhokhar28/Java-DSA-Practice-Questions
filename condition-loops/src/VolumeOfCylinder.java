import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter Value Of Hight : ");
        int hight = sc.nextInt();
        System.out.println("Volume Of Cylinder Having Hight " + hight + " And Radius " + radius + " Is " + (Math.PI * Math.pow(radius, 2) * hight));
    }
}
