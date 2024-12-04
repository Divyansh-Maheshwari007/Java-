 //WAP to Print  only even nos. from an integer array
import java.util.Scanner;
class Even{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number You want to compare : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter a number :  ");
			 a[i] = sc.nextInt();
		}
		System.out.println("");
		System.out.println("Here are even number you enter ");
		for(int i=0; i<n; i++){
			if(a[i]%2==0)
				System.out.println(a[i]+" Even numer");
			else 
				System.out.println(a[i]+" Odd number");
		}
	}
}