import java.util.Scanner;
class Max{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		 for(int  i=0; i<n; i++)
		{
		System.out.print ( (i+1)+ " Enter the number :-  ");
		 a[i] = sc.nextInt();
		}
		int max=a[0];
		for(int i=1; i<a.length; i++){
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number "+max);
	}
}
		