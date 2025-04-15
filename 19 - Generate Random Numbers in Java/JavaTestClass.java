import java.util.Random;

public class JavaTestClass {
    public static void main(String[] arguments) {
        int number;
        Random random = new Random();
        number = random.nextInt(6);
        System.out.println("Generated number is : " + (number + 1));
    }
}
