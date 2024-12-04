// print the Fibonacci series up to a given number using a do-while loop.

import java.util.Scanner;
class Fibonacci
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int p=0;
int c=1,u=0;


do{
u=p+c;
System.out.println(u);
p=c;
c=u;
n--;


}while(n>0);



}}
