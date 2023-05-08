import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value");
        // int num = sc.nextInt();
        int i;
        for (i = 1; i <= 50; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
