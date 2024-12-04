import java.util.Scanner;
class Array1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age[] = new int[10];
		int i;
		for( i=0; i<5; i++)
		{
		System.out.print (" Enter Age  "+ (i+1) + "  Student = ");
			age[i] = sc.nextInt();
		}
		
		for( i=4; i>=0; i--)
		{
			System.out.println("Age of "+ (i+1) +"  Student :-  " + age[i]);
		}
	
	
		
	}
}