import java.util.Scanner;

    public class CheckLetter {

	public static void main(String[ ] arg)
	{
	
	Scanner input =new Scanner(System.in);
        
	System.out.println("Enter a character : ");
        
	char ch=input.next( ).charAt(0);
        
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	      else
		System.out.println("Entered character "+ch+" is Consonant");	
	}
}