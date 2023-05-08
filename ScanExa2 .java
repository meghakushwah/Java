import java.util.Scanner;

public class ScanExa2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter tne number");
        a = sc.nextInt();

        if (a % 2 == 0) {
            b = a * a;
            System.out.println("the squre of" + " " + a + " " + "is:" + " " + b);
        } else {
            b = a * a * a;
            System.out.println("the cube of" + " " + a + " " + "is:" + " " + b);
        }

    }
}
