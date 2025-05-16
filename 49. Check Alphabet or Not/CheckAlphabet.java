public class CheckAlphabet { 
    public static void main(String[] args) { 
        char ch = '5'; 
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { 
            System.out.println("Alphabet"); 
        } else { 
            System.out.println("Not Alphabet"); 
        } 
    } 
}