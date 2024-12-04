//WAP to print to print array elements which are multiples of 23
import java.util.Scanner;
class Multiples23{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbes you want to find multiles of [23]");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Ente a number : ");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			if(a[i]%23==0)
			System.out.println(a[i] + "it is a multilples of 23");
		}
			
		
		
	}
}