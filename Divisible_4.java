

// Print all numbers from 1 to 50 that are divisible by 4 using a for loop.

import java.util.Scanner;
class Divisible_4
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1; i<=n; i++){
if(i%4==0)
System.out.println(i);

}
}}