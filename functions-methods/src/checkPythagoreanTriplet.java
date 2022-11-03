import java.util.Scanner;

/*[Write a function to check if a given triplet is a Pythagorean triplet or not.]
(https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/)
 (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).*/
public class checkPythagoreanTriplet {
    static void checkTriplet(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println(a + "," + b + "," + c + "," + " Is Pythagorean Triplet");
        }
        if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            System.out.println(a + "," + b + "," + c + "," + " Is Pythagorean Triplet");
        }
        if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
            System.out.println(a + "," + b + "," + c + "," + " Is Pythagorean Triplet");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int number3 = sc.nextInt();
        checkTriplet(number1, number2, number3);
    }
}
