//WAP to swap first 2 array elements

import java.util.Scanner;
class Swapfirst2values{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Enter a number : ");
			a[i]=sc.nextInt();
		}
		
		
		
			temp=a[0];
			a[0]=a[1];
			a[1]=temp;
			
		
		for(int i=0; i<n; i++){
			
			System.out.println(a[i]);
		}
			
		
		
	}
}