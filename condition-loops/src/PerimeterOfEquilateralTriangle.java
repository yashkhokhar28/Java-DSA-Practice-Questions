import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Side : ");
        int side = sc.nextInt();
        System.out.println("Perimeter Of Equilateral Triangle Having Side " + side + " Is " + 3 * side);
    }
}
