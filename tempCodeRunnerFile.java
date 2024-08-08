import java.util.*;

public class EvenString {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String mainString = sc.nextLine();
        int i;
        int j=0;
        String chckStr;
        for( i=0;i<mainString.length();i++)
        {
            if((mainString.charAt(i))==' ')
            {   
                for(int k=j;k<i;k++)
                {
                    System.out.println(chckStr.charAt(i));
                }
            }
            else
                {
                    chckStr+=(mainString.charAt(i)); 
                }
        }
	}
}