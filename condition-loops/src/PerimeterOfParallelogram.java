import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Base : ");
        int base = sc.nextInt();
        System.out.println("Enter Value Of Side : ");
        int side = sc.nextInt();
        System.out.println("Perimeter Of Parallelogram Having Side " + side + " And Base " + base + " Is " + 2 * (base + side));
    }
}
