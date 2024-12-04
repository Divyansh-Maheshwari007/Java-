//WAP to replace array elements with 25 which are greater than 25

import java.util.Scanner;
class Array3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that changes");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Enter a number : ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; i++){
			if(a[i]>25){
				a[i]=25;
			System.out.println(a[i]);
			}
			else
		System.out.println(a[i]);
		}
			
		
		
	}
}