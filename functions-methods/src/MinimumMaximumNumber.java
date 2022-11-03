import java.util.Scanner;

/*[Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
(https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)*/
public class MinimumMaximumNumber {
    static void LargestNumberFromThreeNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " Is Largest ");
        }
        if (b > a && b > c) {
            System.out.println(b + " Is Largest ");
        }
        if (c > b && c > a) {
            System.out.println(c + " Is Largest ");
        }
        if (a == b || b == c || a == c) {
            System.out.println("Type Three Diffrent Number !!!");
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
        LargestNumberFromThreeNumber(number1, number2, number3);
    }
}
