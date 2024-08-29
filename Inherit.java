import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phoneNo;
	String address;
	double salary;
	Employee(String name, int age, long phoneNo, String addres, double salary){
		this.name=name;
		this.age = age;
		this.phoneNo=phoneNo;
		this.address = addres;
		this.salary= salary;
	}
	
	void printDetails() {
		System.out.println("Name:"+name+"\nAge:"+age+"\nPhoneNo:"+phoneNo+"\nAddress:"+address+"\nSalary:"+salary);
	}
		
	}
		
class Officer extends Employee{
	String Specialisation;
	Officer(String name, int age, long phoneNo, String addres, double salary, String specialization) {
		super(name,age, phoneNo, addres, salary);
		this.Specialisation = specialization;
	}
	void printspecialization(){
		System.out.println("Specialisation:"+Specialisation);
	}
}
	class Manager extends Employee
	{
		String Department;
		Manager(String name, int age, long phoneNo, String addres, double salary, String department) {
			super (name,age, phoneNo, addres, salary);
			this.Department=department;
		}
		void printDepartment()
		{
			System.out.println("Department:"+Department);
		}
	}
public class Inherit {

	public static void main(String[] args) {
		
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter details of officer");
		
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("Enter PhoneNo");
			long PhoneNo=sc.nextLong();
			System.out.println("Enter Address");
			String Address=sc.next();
			System.out.println("Enter Salary");
			double Salary=sc.nextDouble();
			System.out.println("Enter Specialisation");
			String Specialisation=sc.next();
			Officer officer = new Officer(name,age, PhoneNo, Address, Salary, Specialisation);

			
			System.out.println("Enter details of Manager");
			System.out.println("Enter name");
			String name1=sc.next();
			System.out.println("Enter age");
			int age1=sc.nextInt();
			System.out.println("Enter PhoneNo");
			long PhoneNo1=sc.nextLong();
			System.out.println("Enter Address");
			String Address1=sc.next();
			System.out.println("Enter Salary");
			double Salary1=sc.nextDouble();
			System.out.println("Enter Department");
			String department=sc.next();
			Manager manager=new Manager(name1,age1,PhoneNo1,Address1,Salary1,department);
			System.out.println("Details Of Manager");
			manager.printDetails();
			manager.printDepartment();
			System.out.println("Details Of Officer");
			officer.printDetails();
			officer.printspecialization();
	}

}
