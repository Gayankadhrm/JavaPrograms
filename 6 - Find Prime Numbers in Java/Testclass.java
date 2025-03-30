import java.util.Scanner;
public class Testclass {

    public static void main(String[] args) {
        
        int number;
        System.out.println("Enter the Number: ");
        Scanner UserIn = new Scanner(System.in);
        number = UserIn.nextInt();
        int flag = 0;

        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        }
        else{
            int middleNumber = number / 2;
            for(int i=2; i<=middleNumber; i++){
                if(number % i == 0){
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is prime number");
            }
        }
    }
}