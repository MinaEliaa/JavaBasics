
import java.util.Scanner;



//You will take number from the user Write a java program to print its factorial.
public class five {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter the factorial number");
        
        int number = input.nextInt();
        
        int sum =1;
        
        for(int i =1;i<=number;i++){
            
            sum=sum*i;
        }
        
        System.out.println("the result "+sum);
    }
    
    
    
}
