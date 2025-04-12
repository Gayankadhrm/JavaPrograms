public class JavaTestClass {
    public static void main(String[] args) {
        int year = 2024;
        boolean leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        System.out.println(year + " is a leap year? - " + leap);
    }
}
