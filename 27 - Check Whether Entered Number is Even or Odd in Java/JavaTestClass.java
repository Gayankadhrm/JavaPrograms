import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] arguments) {
        int number;
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println("Entered number is " + evenOrOdd + " number");
    }
}
