import java.util.Scanner;

/*[Define a program to find out whether a given number is even or odd.]
(https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)*/
public class EvenOddNumber {
    static void OddOREven(int no) {
        if (no % 2 == 0) {
            System.out.println(no + " Is Even ");
        } else {
            System.out.println(no + " Is Odd ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int number = sc.nextInt();
        OddOREven(number);
    }
}
