import java.util.Scanner;

/*Compound Interest = P(1 + R/100)r
Where,
P is principal amount
R is the rate and
T is the time span
*/

public class CompoundInterestJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        int principle = sc.nextInt();
        System.out.println("Enter Rate : ");
        int rate = sc.nextInt();
        System.out.println("Enter Time : ");
        int time = sc.nextInt();
        System.out.println("Compound Intrest : " + (Math.pow((1 + rate / 100), time)));
    }
}
