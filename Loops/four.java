
import java.util.Scanner;






//You take two number from the user , base and power The output: Base ^ power
public class four {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter the base and the power ");
        int base = input.nextInt();
        int power = input.nextInt();
        
        int sum=0;
        
        for (int i=1;i<=power;i++){
            sum=sum+base;
            
        }
        
        System.out.println("Result is "+sum);
        
        
        
    }
    
}
