import java.util.*;

public class JavaTestClass {

    public static void main(String[] args) {

        int number;

        System.out.println("Enter the number to find sum of digits: ");
        Scanner UserIn = new Scanner(System.in);
        number = UserIn.nextInt();

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of all digits is : " + sum);

    }
}