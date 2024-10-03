package abstra;
import java.io.*;
public class filehandle 
{
	public static void main(String[]Args) 
	{
		try 
		{
			File myObj = new File("thefile.txt");
			if (myObj.createNewFile()) 
			{
				System.out.println("File created succesfully"+myObj.getName());
			}
			else 
			{
				System.out.println("File Already Exists");
			}
			File myObj1 = new File("itsthefile.txt");
			if (myObj1.createNewFile()) 
			{
				System.out.println("File created succesfully"+myObj1.getName());
			}
			else 
			{
				System.out.println("File Already Exists");
			}
			FileInputStream fin = new FileInputStream("thefile.txt");
			FileOutputStream fout =new FileOutputStream("itsthefile.txt");
			int i;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
			System.out.println("Succcessfully wrote to the specific file");
			fin.close();
			fout.close();
		}
		
		catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e) 
		{ 
			System.out.println(e.getMessage());
		}
	} 
}
