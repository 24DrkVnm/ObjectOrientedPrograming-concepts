package abstra;
import java.util.Scanner;
class AgeException extends Exception
{
	public AgeException(String message) 
	{
		super(message);
	}
}
public class custexcept {
	public static void custexcept(int age)throws AgeException
	{
		if(age<18) 
		{
			throw new AgeException("Age must be above 18");
		}
		System.out.println("Age is valid");
	}
public static void main (String[]Args) 
{
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your age");
	age = sc.nextInt();
	try 
	{
		custexcept(age);
	}
	catch(AgeException e)
	{
		System.out.println("Error:"+e.getMessage());
	}
}
}