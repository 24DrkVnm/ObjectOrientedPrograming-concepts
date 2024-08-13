import java.util.Scanner;

public class reverseprint {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String mainString = sc.nextLine();
        int i;
        int k;
        int x=0;
        int j=0;
        int length = (mainString.length());
        int reqSpace= length + (length-1);
        int divlen=(length/2);
        String newStr=("");
        for( i=length/2;i<length;i++)
        {
            for( j=reqSpace;j>=0;j--)
                    {
                        System.out.print(" ");
                    }
            for( k=divlen;k<=i;k++)
            {
                System.out.print(mainString.charAt(k));
                x=k;
            }
            newStr=newStr+mainString.charAt(x);
            System.out.println("");
            reqSpace--;
        }
        for( i=0;i<=(length/2);i++)
        {
            for( j=reqSpace;j>=0;j--)
                    {
                        System.out.print(" ");
                    }
            for(k=0;k<=i;k++)
            {
                System.out.println(newStr+mainString.charAt(k));
                x=k;
            }
            reqSpace--;
        }
	}
}