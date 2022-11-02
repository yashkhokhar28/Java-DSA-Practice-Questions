import java.util.Scanner;

/*6. Input currency in rupees and output in USD.*/

public class IndianCurrencyToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value In Indian Currency");
        int indiancurrency = sc.nextInt();
        System.out.println("The Value Of " + indiancurrency + " In USD Is " + indiancurrency / 82.74);
    }
}
