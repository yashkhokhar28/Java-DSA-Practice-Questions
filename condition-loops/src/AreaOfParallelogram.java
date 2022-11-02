import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Base : ");
        int base = sc.nextInt();
        System.out.println("Enter Value Of Side : ");
        int side = sc.nextInt();
        System.out.println("Are Of Parallelogram Having Side " + side + " And Base " + base + " Is " + (base * side));
    }
}
