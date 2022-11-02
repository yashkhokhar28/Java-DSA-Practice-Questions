import java.util.Scanner;

/*In cricket, a player's batting average is the total number of runs they have scored divided
        by the number of times they have been out, usually given to two decimal places.*/

public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Runs : ");
        int runs = sc.nextInt();
        System.out.println("Enter Number Of Out's : ");
        int outs = sc.nextInt();
        System.out.println("Batting Avarage = " + (runs / outs));

    }
}
