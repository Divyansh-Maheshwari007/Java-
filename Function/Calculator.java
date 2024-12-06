import java.util.Scanner;
class Calculator{
	void add(int a ,int b)
	{
		System.out.println("Sum : "+a+"+"+b+"="+(a+b));
	}
	void subtract(int a ,int b){
		System.out.println("Subtract : "+a+"-"+b+"="+(a-b));
	}
	void multi(int a, int b){
		System.out.println("Multi : "+a+"*"+b+"="+(a*b));
	}
	void division(int a, int b){
		System.out.println("division : "+a+"/"+b+"="+(a/b));
	}
	public static void main(String [] args){
		Calculator a=new Calculator();
		a.add(5,8);
		a.subtract(8,6);
		a.multi(5,5);
		a.division(10,5);
		
	}
}