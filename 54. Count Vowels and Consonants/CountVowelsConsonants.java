public class CountVowelsConsonants { 
    public static void main(String[] args) { 
        String str = "Java Programming"; 
        int vowels = 0, consonants = 0; 
        str = str.toLowerCase(); 
        for(int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                vowels++; 
            } else if(ch >= 'a' && ch <= 'z') { 
                consonants++; 
            } 
        }
    }
}