import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        System.out.print("Factors of this number: ");
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}