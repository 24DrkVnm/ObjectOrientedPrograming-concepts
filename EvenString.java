import java.util.Scanner;

public class EvenString {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
        String mainString = sc.nextLine();
        int i;
        int j=0;
        String chckStr= new String();
        mainString+=" ";
        for( i=0;i<mainString.length();i++)
        {
            if((mainString.charAt(i))==' ')
            {   
                if ((chckStr.length())%2==0) {
                    System.out.println(chckStr);
                    chckStr="";
                }
                else
                    chckStr="";
            }
            else
                {
                    chckStr=chckStr+(mainString.charAt(i)); 
                }
        }
	}
}