
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbre");
        int num = sc.nextInt();

        System.out.println("The table of" + " " + num + " " + "is:");
        int i, b;

        for (i = 1; i <= 10; i++) {
            b = num * i;
            System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + b);
        }
    }
}
