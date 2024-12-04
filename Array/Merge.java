//WAP to merge 2 array elements into a new array
import java.util.Scanner;
class Merge{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[2*n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Enter a number : ");
			a[i]=sc.nextInt();
			c[i]=a[i];	
		}
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Enter a number : ");
			b[i]=sc.nextInt();
			c[n+i]=b[i];
			
		}
		
			
			
			for(int i=0; i<n*2; i++){
			System.out.print(c[i]);
			}
			
			
}}