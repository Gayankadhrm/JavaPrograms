import java.util.*;

public class JavaTestClass {

    public static void main(String[] args) {
        
        int count;

        System.out.println("Enter the count of numbers: ");
        Scanner UserIn = new Scanner(System.in);
        count = UserIn.nextInt();

        int number, sum = 0;
        float average =0;

        System.out.println("Now enter the numbers: ");

        for(int i=0; i<count; i++){
            number = UserIn.nextInt();
            sum = sum + number;
        }

        average = sum / count;

        System.out.println("Sum of entered numbers: " + sum);
        System.out.println("Average of entered numbers: " + average);
    }
}