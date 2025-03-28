import java.util.*;

public class JavaTestClass {

    public static void main(String[] args) {
        
        int [] array = {1,2,3,4,5,6,7,8};
        int lenght = array.length;
        int sum = 0;

        for(int i = 0; i<lenght; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of elements of array : " + sum);
        float average = sum / lenght;
        System.out.println("Average of elements of array : " + average);
    }
}