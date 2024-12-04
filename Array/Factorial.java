import java.util.Scanner;
class Element_Replace{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s,i,flag=0,cout=0;
		int ar[]=new int[10];
		 
		for(i=0; i<ar.length; i++)
		{
			System.out.print("Enter a "+(i+1)+"st number : ");
			ar[i]= sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Enter element to search : ");
		s=sc.nextInt();
		 
		
		for(i=0; i<ar.length; i++)
		{
			if(ar[i]==s)
			{
				flag=1;
				break;
			}
		}
		System.out.println();
		
		if(flag == 1)
			System.out.println("Element present in array : "+(i+1));
		else
			System.out.println("Element is not Present in array");
		
		for(i=0; i<ar.length; i++)
		{
			if(ar[i]==s)
			{
				cout++;
			}
		}
		System.out.print("Element present in group at "+cout+" times");
	}
}