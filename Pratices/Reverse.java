// Reverse the digits of given number using a do-while loop.
// Example 123 :- 321 

import java.util.Scanner;
class Reverse
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int rev=0;

	do
	{	
	int rem=n%10;
	rev=rev*10+rem;
	n/=10; 
	}while(n!=0);

System.out.println(rev);

}}
