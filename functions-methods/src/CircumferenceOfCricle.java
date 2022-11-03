import java.util.Scanner;

/*[Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]
(https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)*/
public class CircumferenceOfCricle {
    static double circumference(int r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle : ");
        int radius = sc.nextInt();
        float circumference = (float) circumference(radius);
        System.out.println("circumference : " + circumference);
    }
}
