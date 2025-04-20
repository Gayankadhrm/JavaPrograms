public class JavaTestClass {
    public static void main(String[] arguments) {
        int row = 10;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
