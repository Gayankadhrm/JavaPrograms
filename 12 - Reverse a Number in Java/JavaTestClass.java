import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int answer = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            answer = answer * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + answer);
    }
}
