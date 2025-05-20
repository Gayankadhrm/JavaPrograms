public class RemoveWhitespace { 
    public static void main(String[] args) { 
        String str = "J a v a"; 
        String noSpace = str.replaceAll("\\s", ""); 
        System.out.println("Without spaces: " + noSpace); 
    } 
}