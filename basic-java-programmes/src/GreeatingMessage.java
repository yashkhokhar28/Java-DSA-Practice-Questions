import java.util.Scanner;

/*2. Take name as input and print a greeting message for that particular name.*/
public class GreeatingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Good Name");
        String name = sc.nextLine();
        System.out.println("Good Morning " + name + "! Have A Nice Day ");

    }
}
