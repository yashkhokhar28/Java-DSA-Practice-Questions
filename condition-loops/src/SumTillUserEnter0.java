import java.util.Scanner;

/*Take integer inputs till the user enters 0 and print the sum of all numbers
(HINT: while loop)*/

public class SumTillUserEnter0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number != 0) {
            number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
