import java.util.Scanner;
public class GreaterOfThree
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the three numbers");
  int a= sc.nextInt();
  int b= sc.nextInt();
  int c=sc.nextInt();
  if ((a>c || a==c) && (a>b || a==b)){
  	System.out.println("a is greatest");
  	}
  else if (b>a && b>c || b==c){
  		System.out.println("b is greatest");
  	}
  else if (c>b && c>a){
  		System.out.println("c is greatest");
  		}
  else {
  System.out.println("Please enter different NUMBERS");
  }
  }
 }
