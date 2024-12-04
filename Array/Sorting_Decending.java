// Shorting of array element in Decending order
import java.util.Scanner;
class Sorting_Decending{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		
		for(int i=0; i<ar.length; i++){
			System.out.print("Enter the Element :- ");
			ar[i] = sc.nextInt();	
		}
		int temp;
		for(int i=0; i<ar.length; i++){
			for(int j=i; j<ar.length; j++){
				if(ar[i]<ar[j]){
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++){
			System.out.println("Sorting element of array : "+ar[i]);
		}
	}
} 