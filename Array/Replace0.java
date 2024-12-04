//WAP to replace all odd positions array values with 0
import java.util.Scanner;
class Replace0{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which you want to replaces with 0");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Ente a number : ");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i+=2){
			
			System.out.println(" 0 ");
		}
			
		
		
	}
}