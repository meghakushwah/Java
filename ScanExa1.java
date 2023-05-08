import java.util.Scanner;

public class ScanExa1 {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of person");
        age = sc.nextInt();

        if (age >= 13) {
            if (age <= 20)
                System.out.println(" The person is Teenager");

            else
                System.out.println("The person is Adult");
        } else
            System.out.println("The person is child");

    }
}
