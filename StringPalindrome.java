import java.util.Scanner;
public class StringPalindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check if it is palindrome");
		String mainStr = sc.nextLine();
		int flag=0;
		int len=mainStr.length();
		for (int i=0;i<len/2;i++)
		{
			if (mainStr.charAt(i)!=mainStr.charAt(len-i-1)) 
			{
				flag=1;
			}
			
		}
		if(flag==1) 
		{
			System.out.println("Given String "+mainStr+" is not a Palindrome");
		}
		else
			System.out.println("Given String "+mainStr+" is a palindrome");
		
	}
}
