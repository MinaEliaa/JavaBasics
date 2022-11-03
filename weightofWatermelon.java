
import java.util.Scanner;


public class weightofWatermelon {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the weight");
        
        int weight = input.nextInt();
        
        if(weight>2)
        {
        if((weight%2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        else
            System.out.println("NO");        
        
        
        
    
    }
    
}
