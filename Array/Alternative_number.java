//WAP to print sum of alternate nos of an integer array
import java.util.Scanner;
class Alternative_number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+" Enter a number : ");
			a[i]= sc.nextInt();
			}
			
			for(int i=0; i<n; i+=2){
				System.out.print(a[i]+" ");
			}
}
	}