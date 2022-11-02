import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter Value Of Hight : ");
        int hight = sc.nextInt();
        System.out.println("Enter Value Of Width : ");
        int width = sc.nextInt();
        System.out.println("Volume Of Pyramid Having Hight " + hight + " And Radius " + radius + " Width  " + width + " Is " + (radius * hight * width / 3));
    }
}
