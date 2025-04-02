import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] arguments) {
        int number;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int answer = factorial(number);
        System.out.println("Factorial of " + number + " is " + answer);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
