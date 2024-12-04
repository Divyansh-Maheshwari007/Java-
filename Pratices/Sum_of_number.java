// Calculate the sum of number using do while loop for  1 to given by number;

import java.util.Scanner;
class Sum_of_number
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sum=0;

do{
sum+=n;
n--;
}while(n!=0);


System.out.println(sum);

}}