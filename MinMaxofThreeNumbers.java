


    import java.util.Scanner;
    
    //max and min number of three numbers with conditional operator

    public class MinMaxofThreeNumbers {
        
    public static void main(String[] args) {
        
        Scanner input =new Scanner (System.in);
        
        System.out.println("Please enter the 3 numbers");
        
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        
        int max = (num1>=num2)?((num1>=num3)? num1:num3) :((num2>=num3)?num2:num3);
        int min = (num1<=num2)?((num1<=num3)? num1:num3) :((num2<=num3)?num2:num3);
        
        System.out.println(max+" is max number");
        System.out.println(min+" is min number");
        
    }
    
}
