//Examples:
//Input: arr[] = {1, 4, 3, 2, 6, 5}  
//Output: {5, 6, 2, 3, 4, 1}
//Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

import java.util.Scanner;
class Reverse_array{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number to want replaces ");
		int n=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println(" Enter number  : ");
			a[i] = sc.nextInt();
		}
	      
		   
	 for(int j=0;j<a.length; j++){
		 b[j]=a[n-j-1];
		 System.out.println(b[j]);
	 }
	
		
	}
}