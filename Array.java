import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();

        int marks[] = new int[size];
        int i;

        // input
        for (i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        // output
        for (i = 0; i < size; i++)
            System.out.println(marks[i]);
    }
}
