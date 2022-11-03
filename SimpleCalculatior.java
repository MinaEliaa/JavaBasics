
import java.util.Scanner;

public class SimpleCalculatior {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
       System.out.println("enter a operator and 2 numbers ");
        
        
        char operator =input.next().charAt(0);
        int num1=input.nextInt();
        int num2=input.nextInt();
        
       
        
        switch (operator) {
            case '+':
                
                System.out.print(num1+num2);
                break;
            case '-':
                
                System.out.print(num1-num2);
                break;
            case 'x':
                
                System.out.print(num1*num2);
                break;
            case '/':
                
                System.out.print(num1/num2);
                break;
            default:
                System.out.println("invlaid operator");
                break;
        }
    }
    
}
