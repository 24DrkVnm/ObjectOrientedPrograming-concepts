import java.util.Scanner;

public class vowelCount {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be searched through");
		String mainStr = sc.nextLine();
		int vowCount=0;
		int chCount=0;
		int spCount=0;
		int len=mainStr.length();
		for (int i=0;i<len;i++)
		{
			if ((mainStr.charAt(i)== 'a')|| (mainStr.charAt(i)=='e')||(mainStr.charAt(i)=='i')||(mainStr.charAt(i)=='o')||(mainStr.charAt(i)=='u')) 
			{
				vowCount++;
			}
			else if(mainStr.charAt(i)==' ')
					{
				spCount++;
					}
			
		}
		chCount=(len-(vowCount+spCount));
		System.out.println("Given String has "+vowCount+" vowels"+","+chCount+" consonants and"+spCount+" spaces");
			
	}
}
