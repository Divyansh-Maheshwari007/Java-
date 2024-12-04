// Q.5 print all odd number for 1 to given by user 

import java.util.Scanner;
class Odd_number
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int a;

for(int i=1; i<=n; i++){
 
if(i%2!=0)
{
System.out.println(i);
}


 }



}
}