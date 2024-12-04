//WAP to print Average of all array elements
import java.util.Scanner;
class Average{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbes you want to average");
		int n = sc.nextInt();
		int sum=0;
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Ente a number : ");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
			sum+=a[i];
		
		int average=sum/n;
		System.out.print("Average of the given number :"+average);
	}
}