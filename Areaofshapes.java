import java.util.Scanner;
class areaof
	{
		void area(double r) 
		{
			double arC=3.14*r*r;
			System.out.println("Area of the circle is "+arC);
		}
		void area(int l,int br) 
		{
			int arR=l*br;
			System.out.println("Area of the rectangle is "+arR);
		}
		void area(double b, double h ) 
		{
			double arT=0.5*b*h;
			System.out.println("Area of the Triangle is "+arT);
		}
	}
public class Areaofshapes 
	{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose one of the following to find its area \n 1.Rectangle \n 2. Circle \n 3. Triangle");
		int val =sc.nextInt();
		if (val==1)
		{
			System.out.println("Enter the Length and breadth of the rectangle");
			int len=sc.nextInt();
			int breadth=sc.nextInt();
			areaof a=new areaof();
			a.area(len,breadth);
		}
		else if (val==2)
		{
			System.out.println("Enter the radius of the circle");
			double rad=sc.nextDouble();
			areaof a=new areaof();
			a.area(rad);
		}
		else if (val==3)
		{
			System.out.println("Enter the base and height of the triangle");
			double base=sc.nextDouble();
			double height=sc.nextDouble();
			areaof a=new areaof();
			a.area(base,height);
		}
		}
	}
