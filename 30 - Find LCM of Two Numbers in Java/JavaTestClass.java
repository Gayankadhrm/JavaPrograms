import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        int lcm = (n1 > n2) ? n1 : n2;
        
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("LCM of entered numbers: " + lcm);
                break;
            }
            ++lcm;
        }
        
        sc.close();
    }
}
