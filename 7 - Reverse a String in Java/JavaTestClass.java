public class JavaTestClass {
    public static void main(String[] arguments) {
        String str = "Programming for beginners";
        String reverseStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverseStr = ch + reverseStr;
        }

        System.out.println("Reversed string is : " + reverseStr);
    }
}
