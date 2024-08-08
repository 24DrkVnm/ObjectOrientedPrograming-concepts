import java.util.Scanner;

public class Grocceries {
	public static void main(String[] args)
	{	
		System.out.println("Choose the items to Bill|1.Milk|2.Rice|3.oats|4.Bannana|5.Apples|0.EXIT");
		System.out.println("Enter or scan the code");
		int one = 60;
		int two = 100;
		int three = 50;
		int four = 90;
		int five = 150;
		int total=0;
		int n=1;
		for (int i=0;n!=0;i++)
		{
			Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
			if(n==0)
			{
				break;
			}
			else 
			{
				switch(n)
				{
				case (1):
					total=total+one;
					break;
				case 2:
					total=total+two;
					break;
				case 3:
					total=total+three;
					break;
				case 4:
					total=total+four;
					break;
				case 5:
					total=total+five;
					break;	
				}
			}	
		}
		System.out.println("Total amount to be paid:"+total);
		System.out.println("Enter the amount paid");
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		if (change>total) 
		{	
			int bal=total-change;
			System.out.println("Paid:"+change+" To return:"+bal);
		}
		System.out.println("Have a good Day");
	}
}
