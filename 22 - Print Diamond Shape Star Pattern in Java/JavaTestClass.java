public class JavaTestClass {
    public static void main(String[] args) {
        int row = 5;

        // Upper half of diamond
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of diamond
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
