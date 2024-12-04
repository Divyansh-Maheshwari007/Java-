
// WAP to update all array elements with 10
import java.util.Scanner;
class Updatevalue{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you want to Update with 10");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". Enter a number : ");
			a[i]=sc.nextInt();
			a[i]=10;
		}
		for(int i=0; i<n; i++){
			
			System.out.println(a[i]);
		}
			
		
		
	}
}