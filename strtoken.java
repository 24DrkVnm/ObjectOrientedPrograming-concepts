package abstra;
import java.util.*;
public class strtoken 
{
	public static void main(String [] Args) {
		
	int sum=0;
	System.out.println("Enter the numbers in a line with space btw them");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringTokenizer st = new StringTokenizer(s," ");
	while(st.hasMoreTokens()) 
	{
		String a=st.nextToken();
		int n=Integer.parseInt(a);
		sum=sum+n;
	}
	System.out.println("Sum of all entered integers is "+sum);
}}
