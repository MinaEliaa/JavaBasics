
import java.util.Scanner;



import java.util.Scanner;
//9- Write a java program that read positive numbers from user Until read a negative
//number ... then calculate and print The average of these numbers.
public class nine {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        int counter =0;
        int sum = 0;
        
        System.out.println("enter the numbers");
        int n =input.nextInt();
        while (n>0){
            
            sum=sum+n;
            counter ++;
       
        }
        
        System.out.println("the average of these numbers "+sum/counter);
        
        
    }
    
}
