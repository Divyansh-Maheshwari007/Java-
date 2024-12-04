// Calculate and print the factorial of a number (given by the user) using for loop
import java.util.Scanner;
class Factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int fact=1;
for(int i=1; i<=n; i++)
{
fact*=i;
}
System.out.println("Factorial of " +n+ " :-"+"  "+fact);
}}