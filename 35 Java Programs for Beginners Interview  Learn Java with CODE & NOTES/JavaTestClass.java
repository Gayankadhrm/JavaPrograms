import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        System.out.println("Sum of natural numbers : " + sum(number));
        scanner.close();
    }

    public static int sum(int value) {
        if (value == 0) {
            return 0;
        }
        return value + sum(value - 1);
    }
}