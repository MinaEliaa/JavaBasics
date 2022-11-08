
import java.util.Scanner;

//Write java program to read integer from user then print sum of digit means add
//all the digits of any number for example if user enter 123 .output is 6 because 1 +2
//+3 = 6 an so on
public class ten {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter the number ");
        
        int sum=0;
        int reminder=0;
        int n = input.nextInt();
        
        while (n!=0){

        reminder=n%10;
        sum=sum+reminder;

        n=n/10;

    }
        System.out.println(sum);
    }
    
}
