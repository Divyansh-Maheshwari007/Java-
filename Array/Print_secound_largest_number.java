// Shorting of array element in Assending orfer with Print_secound_largest_number
import java.util.Scanner;
class Print_secound_largest_number{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[3];
		
		for(int i=0; i<ar.length; i++){
			System.out.print("Enter the Element :- ");
			ar[i] = sc.nextInt();	
		}
		int temp;
		for(int i=0; i<ar.length; i++){
			for(int j=(i+1); j<ar.length; j++){
				if(ar[i]>ar[j]){
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++){
			System.out.println(ar[i]);
		}
		
			System.out.println("Secound largest element: "+(ar[ar.length-2]));
		
	}
} 