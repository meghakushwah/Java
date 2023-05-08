import java.util.Scanner;

public class SwitchcaseEx1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ptress 1 for Hindi");
        System.out.println("Ptress 2 for English");
        System.out.println("Enter your choise");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have selected Hindi langauge");
                break;
            case 2:
                System.out.println("You have selected English langauge");
                break;

            default:
                System.out.println("Wrong input!");
        }

    }
}