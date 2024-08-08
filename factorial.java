import java.util.Scanner;
public class Factorial
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  int fact=1;
  int i;
  System.out.println("Enter the number");
  int a= sc.nextInt();
  for (i=a;i!=0;i--){
  	fact=fact*i;
  }
  System.out.println("Factorial of the given number is "+fact);
  }
 }
