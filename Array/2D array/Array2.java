import java.util.Scanner;
class Array2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size you want");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0; i<n; i++){
			
			for( int j=0; j<n; j++){
		
		   System.out.print("Enter element at a["+i+"]["+j+"] ");
		    a[i][j]=sc.nextInt();
			}
			System.out.println();
			 
			
		}
		for(int i=0; i<n; i++){
			
			for(int j=0; j<n; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}