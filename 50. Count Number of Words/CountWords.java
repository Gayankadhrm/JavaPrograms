public class CountWords { 
    public static void main(String[] args) { 
        String str = "Java is fun"; 
        String[] words = str.split("\\s+"); 
        System.out.println("Word count: " + words.length); 
    } 
}