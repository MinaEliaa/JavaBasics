
    import java.util.Scanner;
//2-SortingThreeFloatingNumbers

public class sorting {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter the 3 numbers");
        
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        
        if (num1>=num2 && num1>=num3){
            
            if (num2>=num3){
            
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
                           }
            else {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2); 
                 }
            
            
                                     }
        else if (num2>=num1 && num2>=num3){
            if(num1>=num3){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3); 
                          }
            else {
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
                 }
                    
                                          }
         else if (num3>=num1 && num3>=num2){
            if(num1>=num2){
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2); 
                          }
            else {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
                 }
                    
                                          }        
         
    }
    
}
