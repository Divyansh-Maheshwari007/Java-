//2. WAP to remove the duplicates elements from the array and print unique elements
import java.util.Scanner;
class Unique{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int ar[]=new int[5];
   
    for(int i=0; i<ar.length; i++){
		System.out.print("Enter Element ");
		ar[i]=sc.nextInt();
		} 
    	
     	for(int i=0; i<ar.length; i++){
			for(int j=0; j<ar.length; j++){
				if(ar[i]==ar[j])
					System.out.print("");
					else 
					System.out.print(ar[i]);	
			}
		}	
	}
}