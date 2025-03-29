import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class JavaTestClass {
    public static void main(String[] arguments) throws IOException, NumberFormatException {
        int n; // Declare a variable to store the input number
        
        // Prompt the user to enter a value for 'n'
        System.out.print("Enter n value: ");
        
        // Create a BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the input as a string and convert it to an integer
        n = Integer.parseInt(br.readLine());
        
        // Calculate the sum of the first 'n' natural numbers using the formula: (n * (n + 1)) / 2
        int sum = (n * (n + 1)) / 2;
        
        // Display the result
        System.out.println("Sum of first " + n + " numbers: " + sum);
    }
}
