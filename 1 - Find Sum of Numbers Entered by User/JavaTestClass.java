import java.util.*;

public class JavaTestClass {

    public static void main(String[] args) {
        
        int count;

        System.out.println("Enter count of numbers: ");
        Scanner UserIn = new Scanner(System.in);
        count = UserIn.nextInt();

        System.out.println("Now enter the numbers: ");

        int number , sum = 0;

        for(int i=0; i<count; i++){
            number = UserIn.nextInt();
            sum = sum + number;
        }
        System.out.println("Sum of all these numbers: " + sum);
    }
}