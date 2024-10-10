package abstra;
import java.util.*;
import java.io.*;
public class FReader 
	{
			public static void main(String[]Args) 
			{
				try {
				Scanner sc=new Scanner(System.in);
			
				File f1=new File("Register1.txt");
				f1.createNewFile();
				System.out.println("new file created");
				
				FileWriter fout=new FileWriter("Register1.txt");
				System.out.println("Enter your KEAM Rank");
				int n=sc.nextInt();
				fout.write(n+"\n");
				fout.close();
				
				FileReader fin=new FileReader("Register1.txt");
				BufferedReader br=new BufferedReader(fin);
				String line;
				System.out.println("Contents of file are");
				while((line=br.readLine())!=null) 
				{
					System.out.println(line);
				}
					br.close();
				}
				catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
	}

