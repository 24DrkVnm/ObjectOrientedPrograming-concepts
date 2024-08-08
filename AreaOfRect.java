
import java.util.Scanner;
public class AreaOfRect
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length and breadth of the rectangle");
  int l= sc.nextInt();
  int b= sc.nextInt();
  int ar=l*b;
  System.out.println("Area of the rectangle = "+ar);
  }
 }
