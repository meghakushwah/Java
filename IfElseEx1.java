import java.util.Scanner;

public class IfElseEx1 {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the amount");
        // int amount = sc.nextInt();
        int amount=5000;
        if (amount >= 500) {
            if (amount <= 20000)
                System.out.println("Withdrawal Successful");
            else
                System.out.println("Try Again!");
        } else
            System.out.println("Withdrawal amount should be greater than 500!");
    }
}
