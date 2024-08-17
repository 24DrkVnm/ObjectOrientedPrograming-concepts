import java.util.Scanner;

public class matrixmult {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns of the first matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the number of rows and coloumns of the second matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int arr1[][]=new int[r1][c1];
		int	arr2[][]=new int[r2][c2];;
		int	multarr[][]=new int[r1][c2];;
		int i,j,k;
		if(c1!=r2) 
		{
			System.out.println("Multiplication is not possible");
		}
		System.out.println("Enter the elements of the first matrix");
		for(i=0;i<r1;i++) 
		{
			for(j=0;j<c1;j++) 
			{
				arr1[i][j] =sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix");
		for(i=0;i<r2;i++) 
		{
			for(j=0;j<c2;j++) 
			{
				arr2[i][j] =sc.nextInt();
			}
		}
		
		for(i=0;i<r1;i++) 
		{
			for(j=0;j<c2;j++) 
			{
				for(k=0;k<c1;k++) 
				{
					multarr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		for(i=0;i<r1;i++) 
		{
			for(j=0;j<c2;j++) 
			{
			 System.out.print(multarr[i][j]+" ");
			}
			System.out.println("");
		}
		

	}

}
