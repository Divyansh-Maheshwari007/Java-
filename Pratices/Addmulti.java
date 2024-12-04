// find the sum of number from 1 to 100 that are multiples of 3 using a for loop.

import java.util.Scanner;
class Addandmulti{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int sum=0;
for(int i=1; i<=n; i++){

if(i%3==0){
sum+=i;
}

}
System.out.println(sum);
}}