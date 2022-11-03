import java.util.Scanner;

/*[Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
Factorial of any number n is represented by n! and is equal to 1 _ 2 _ 3 _ .... _ (n-1) \*n. E.g.- <br/>
<pre>
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
</pre>*/

public class Factorial {
    static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int number1 = sc.nextInt();
        int fact = findFactorial(number1);
        System.out.println("Factorial Is : " + fact);
    }
}
