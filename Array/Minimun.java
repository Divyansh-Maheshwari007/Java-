import java.util.Scanner;
class Minimun{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of array");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  
	  for(int i=0; i<n; i++){
		  System.out.print( (i+1) +". Enter the number :- ");
		  a[i] = sc.nextInt();
	  }
	    int min=a[0];
		for(int i=1; i<n; i++){
		if(min>a[i]){
			min=a[i];
		}
		}
		System.out.println("The Minimum number is :- "min);
  }
}