package abstra;
import java.util.*;

public class except {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		char ch='a';
		System.out.println("Choose Your operation 1:Arithmetic 2:Array");
		int choice=sc.nextInt();
		do {
		switch(choice) 
		{
		case 1:
		
			try
			{
				System.out.println("Enter the numerator");
				int numer=sc.nextInt();
				System.out.println("Enter the denominator");
				int denumer=sc.nextInt();
				int result=numer/denumer;
				System.out.println("Result:"+result);
			}catch(ArithmeticException e)
			{
				System.out.println("Exception  found: "+e.getMessage());
			}
			break;
				
		
		case 2:
			int []arr= {1,2,3};
			try 
			{
				
				System.out.println("Enter the array index to be displayed");
				int ind=sc.nextInt();
				System.out.println("Element is "+arr[ind]);
			}catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Exception found: "+ e.getMessage());
			}
			break;
		}
		
	
		System.out.println("Do you want to enter another number ?");
		ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		sc.close();
		System.out.println("Code executed successfully");
}}
