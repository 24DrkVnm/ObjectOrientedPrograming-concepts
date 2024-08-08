
import java.util.Scanner;
public class Avg
{
 public static void main (String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the numbers to be added");
  int a= sc.nextInt();
  int b= sc.nextInt();
  int c= sc.nextInt();
  int s=a+b+c;
  double avg=s/3;
  System.out.println("Sum="+s);
  System.out.println("Average="+avg);
  }
 }
