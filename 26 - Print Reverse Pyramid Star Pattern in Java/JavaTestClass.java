public class JavaTestClass {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 0; i < row; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars with a space
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
