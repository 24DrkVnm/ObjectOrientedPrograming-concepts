import java.util.Scanner;
public class AreaOfCircle
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius of the circle");
  double pi=3.14159265;
  int r= sc.nextInt();
  double ar=pi*r*r;
  double circum=2*pi*r;
  System.out.println("Area of the circle = "+ar);
  System.out.println("Circumference of the circle = "+circum);
  }
 }
