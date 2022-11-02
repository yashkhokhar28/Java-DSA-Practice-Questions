import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter Value Of Hight : ");
        int hight = sc.nextInt();
        System.out.println("Volume Of Sphere Having Hight " + hight + " And Radius " + radius + " Is " + 4 * (Math.PI * Math.pow(radius, 3) * hight) / 3);

    }
}
