import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        base = sc.nextInt();

        System.out.print("Enter exponent number: ");
        exponent = sc.nextInt();

        System.out.println("The result is: " + Math.pow(base, exponent));
    }
}
