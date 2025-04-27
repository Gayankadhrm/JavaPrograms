import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] arguments) {
        int number;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        String str = String.valueOf(number);
        System.out.println("Number of digits: " + str.length());
    }
}
