
import java.util.Scanner;


//Given a number, print how many times can we divide it by 2?


public class twelve {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("enter the number");
        
        int counter =0;
        int x = input.nextInt();
        
        while(x!=0){
            
            if (x%2==0){
                
                counter ++;
                
            }
            x--;
            
        }
        
        System.out.println(counter+" times");
    }
    
}
