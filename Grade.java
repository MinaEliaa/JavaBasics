
import java.util.Scanner;


public class Grade {
    public static void main(String[] args) {
        
        System.out.print("Enter grade from (A, B, C or F) : ");
        
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter grade from (A, B, C or F) : ");
        
        char grade = input.next().charAt(0);
        
        switch (grade) {
                  case 'A':
                        System.out.println("Grade A  marks >=80");
                        break;
    
                  case 'B':
                        System.out.println("Grade B  marks >=60");
                        break;
 
                  case 'C':
                        System.out.println("Grade C  marks >=40");
                        break;
                        
                  case 'F':
                        System.out.println("Grade F  marks <40 FAIL");
                        break;
                        
                  default :
                        System.out.println("Invalid Grade");
                        break;
    }
    
}

}