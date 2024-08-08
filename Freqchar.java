import java.util.*;

public class Freqchar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be searched through");
		String mainStr = sc.nextLine();
		System.out.println("Enter the Character to be searched");
		char chckStr = sc.nextLine().charAt(0);
		int count=0;
		int len=mainStr.length();
		for (int i=0;i<len;i++)
		{
			if (mainStr.charAt(i)==chckStr) 
			{
				count++;
			}
			
		}
		if (count==0) 
		{
			System.out.println("Character "+chckStr+" was not found in "+mainStr);
		}
		else
			System.out.println("Character "+chckStr+" was found in "+mainStr+" , "+count+" times");
	}
}
