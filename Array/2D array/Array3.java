// addition of  a two matix

import java.util.Scanner;
class Array3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size you want");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			
			for( int j=0; j<n; j++)
			{
		       System.out.print("Enter the 1St array element at a["+i+"]["+j+"] ");
		       a[i][j]=sc.nextInt();
			}
		}	
		System.out.println();
		for(int i=0; i<n; i++)
	    {
			
			for( int j=0; j<n; j++)
			{
		       System.out.print("Enter the 2nd array element at a["+i+"]["+j+"] ");
		       b[i][j]=sc.nextInt();
			}
			
		
		}
		
		for(int i=0; i<n; i++)
		{
			
			for(int j=0; j<n; j++)
			{     
		        c[i][j]=a[i][j]+b[i][j];
				System.out.print(a[i][j]);
				System.out.print(b[i][j]);
				System.out.print(c[i][j]);
			}
				
		
		 System.out.println();
		}
		
	}
}