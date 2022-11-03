import java.util.Scanner;

/*[A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]
(https://www.efaculty.in/java-programs/voting-age-program-in-java/)
*/
public class EligibleForVotingOrNot {
    static void VotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Congratulation !!! , You Can Vote ");
        } else {
            System.out.println("You Have To Wait " + Math.abs(age - 18) + " Years For Voting !!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        VotingEligibility(age);
    }
}
