package abstra;
import java.util.*;
class EvenNum implements Runnable 
{
	public int a ;
	public EvenNum(int a) 
	{
		this.a=a;
	}
	public void run() 
	{
		System.out.println("Thread number "+a+" is even and square is "+a*a);
	}
}
class OddNum implements Runnable 
{
	public int a ;
	public OddNum(int a) 
	{
		this.a=a;
	}
	public void run() 
	{
		System.out.println("Thread number "+a+" is odd and cube is "+a*a*a);
	}
}class RandomNumgenerator
{
	public void run()
	{
		int n=0;
		Random rand=new Random();
		try 
		{
			for(int i=0;i<10;i++)
			{
				n=rand.nextInt(20);
				System.out.println("Generated number is "+n);
				if(n%2==0) 
				{
					Thread thread1 =new Thread(new EvenNum(n));
					thread1.start();
				}
				else 
				{
					Thread thread2 =new Thread(new OddNum(n));
					thread2.start();
				}
			Thread.sleep(1000);
			System.out.println("---------------------------------------------------------------------");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		{}
	}
}
class multithread 
{
	public static void main(String[] Args) 
	{
		RandomNumgenerator rand_num=new RandomNumgenerator();
		rand_num.run();
	}
}
