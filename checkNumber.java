
import java.util.Scanner;





public class checkNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number");
        
        int num =input.nextInt();
        
        if (num<0) {
            System.out.println(num+" is negative number");
        }
        else if (num>=0){
            System.out.println(num+" is postive number");
        }
    }
    
}
