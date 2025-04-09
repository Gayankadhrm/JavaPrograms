public class JavaTestClass {
    public static void main(String[] args) {
        String str = "Programming for beginners";
        int count;

        // Convert the string into character array
        char ch[] = str.toCharArray();

        System.out.print("Duplicate characters in the given string: ");
        for (int i = 0; i < ch.length; i++) {
            count = 1;
            if (ch[i] == '0' || ch[i] == ' ')
                continue;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // Mark character as counted
                }
            }
            if (count > 1)
                System.out.print(ch[i] + " ");
        }
    }
}
