import java.util.Scanner;
class Convert{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int  n=sc.nextInt();
int temp=n;
int sum=0,sum1=0;
int a;
int b;
while(n>0)
{
a=n%10;
	if(a%2!=0)
	{
	System.out.println("Odd number "+a);
	sum+=a;
	}
n=n/10;
}
System.out.println("  ");
while(temp>0){
b=temp%10;
	if(b%2==0){
	System.out.println("Even number "+b);
        sum1+=b;
	}
	
temp=temp/10;
}
System.out.println(" ");
System.out.println("Sum of all Odd numbers:- "+sum);
System.out.println(" ");
System.out.println("Sum of all Even numbers:- "+sum1);

}}