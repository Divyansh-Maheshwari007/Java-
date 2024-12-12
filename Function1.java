import java.util.Scanner;
class Function1{
	int x,y;
	void add(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("Sum = "+(a+b));
		System.out.println("Sum = "+(x+y));
	}
	void sub()
	{
		System.out.println("Difference = "+(x-y));
	}
	void multi()
	{
		System.out.println("Multiple  = "+(x*y));
	}
	void div()
	{
		System.out.println("Quotient  = "+(x/y));
	}


public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Function1 obj = new Function1();
	int a,b;
	System.out.println("Enter a value of a :");
	a = sc.nextInt();
	System.out.println("Enter a value of b :");
	b = sc.nextInt();
	obj.add(a,b);
	obj.sub();
	obj.multi();
	obj.div();
}}