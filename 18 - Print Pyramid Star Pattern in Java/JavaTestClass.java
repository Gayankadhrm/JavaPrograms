public class JavaTestClass {
    public static void main(String[] arguments) {
        int row = 6;

        for (int i = 0; i < row; i++) {
            // Print spaces
            for (int j = row - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
