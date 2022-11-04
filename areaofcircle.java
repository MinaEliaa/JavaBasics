
import static java.lang.Math.PI;
import java.util.Scanner;


public class AreaofCircle {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of circle");
        
        double radius = input.nextDouble();
        
        System.out.println("Area is = "+PI*radius*radius);
        
        
    }
    
}