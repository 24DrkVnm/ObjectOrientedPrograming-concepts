package abstra;
import java.util.*;

class Employee
{
	float Salary;
	double Salary1;
	float DA;
	float HRA;
	void Display()
	{
		System.out.println("Employee");
	}
	void CalcSalary() 
	{
		Salary1 = Salary+(Salary*(DA/100))+(Salary*(HRA/100));
		System.out.println("Gross Salary of Employee "+Salary1);
	}
	
}
class Engineer extends Employee
{
	Engineer(float salary,float da,float hra)
{
		this.Salary=salary;
		this.DA=da;
		this.HRA=hra;
}
	void Display()
	{
		super.Display();
		super.CalcSalary();
		System.out.println("Engineer");
	}
	void CalcSalary() 
	{
		Salary1=Salary1*2;
		System.out.println("Gross Salary of Engineer:"+Salary1);
	}
}
public class methOverriding 
{
	public static void main(String[] Args) 
	{
		Scanner sc=new Scanner(System.in);
		Float Salary,DA,HRA;
		System.out.println("Enter Your Salary");
		Salary =sc.nextFloat();
		System.out.println("Enter DA %");
		DA=sc.nextFloat();
		System.out.println("Enter your HRA %");
		HRA=sc.nextFloat();
		Engineer a=new Engineer(Salary, DA, HRA);
		a.Display();
		a.CalcSalary();
		
	}
}
