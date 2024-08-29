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

public class methOver {

	public static void main(String[] args) {
		
		{
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Length and breadth of the rectangle");
				int len=sc.nextInt();
				int breadth=sc.nextInt();
				areaof a1=new areaof();
				a1.area(len,breadth);

				System.out.println("Enter the radius of the circle");
				double rad=sc.nextDouble();
				areaof a2=new areaof();
				a2.area(rad);
				
				System.out.println("Enter the base and height of the triangle");
				double base=sc.nextDouble();
				double height=sc.nextDouble();
				areaof a3=new areaof();
				a3.area(base,height);
			}

	}

}
