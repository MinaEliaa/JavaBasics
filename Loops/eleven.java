
import java.util.Scanner;



////*11- Write java program to read an integer from user then print how many digit in
//this number


public class eleven {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int counter = 0;
        System.out.println("enter the number");
        int number = input.nextInt();
        
        while (number!=0){
            
            counter++;
            number=number/10;
            
        }
            System.out.println(counter+" Digits");    
    }
    
}
