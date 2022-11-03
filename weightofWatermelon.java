
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mena
 */
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
