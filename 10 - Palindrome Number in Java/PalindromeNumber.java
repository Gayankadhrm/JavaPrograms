import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        int temp = number;
        int reversedNumber = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        if (number == reversedNumber) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

        sc.close();
    }
}
