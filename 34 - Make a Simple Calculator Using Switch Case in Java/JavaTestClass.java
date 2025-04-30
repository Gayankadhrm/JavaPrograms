// JavaTestClass.java
import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double n1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double n2 = scanner.nextDouble();
        
        System.out.println("Enter operator (1: +, 2: -, 3: *, 4: /):");
        int operator = scanner.nextInt();
        
        double result = 0;
        
        switch(operator) {
            case 1:
                result = n1 + n2;
                break;
                
            case 2:
                result = n1 - n2;
                break;
                
            case 3:
                result = n1 * n2;
                break;
                
            case 4:
                result = n1 / n2;
                break;
                
            default:
                System.out.println("Entered operator is not valid");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}