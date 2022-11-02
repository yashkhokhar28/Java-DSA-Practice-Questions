import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Side : ");
        int side = sc.nextInt();
        System.out.println("Perimeter Of Rhombus Having Side " + side + " Is " + 4 * side);
    }
}
