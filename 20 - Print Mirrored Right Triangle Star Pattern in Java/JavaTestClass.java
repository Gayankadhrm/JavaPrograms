public class JavaTestClass {
    public static void main(String[] arguments) {
        int row = 10;
        for (int i = 1; i <= row; i++) {
            for (int j = (row - i) * 2; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
