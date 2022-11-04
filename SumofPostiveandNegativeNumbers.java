
import java.util.Scanner;

public class SumofPostiveandNegativeNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter 2 Postive and 2 Negative Numbers");
        
        int num1P = input.nextInt();
        int num2P = input.nextInt();
        int num1N = input.nextInt();
        int num2N = input.nextInt();
        
        int SumofPostives = num1P+num2P;
        
        int SumofNegative =-1*num1N + -1*num2N;
        
        System.out.println("Sum of positive integers"+SumofPostives);
        System.out.println("Sum of negative integers"+-SumofNegative);
        
        
        
        
    }
}
