import java.util.Scanner;
class Example{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n,a,max=0;
System.out.println("");
System.out.println("How many of number you want to compare that which is Maximum");
int p=sc.nextInt();
for(a=1; a<=p; a++)	
{
System.out.println("enter a number");
n=sc.nextInt();
if(n>max)
max=n;
}
System.out.println(" ");
System.out.println("Maximum number is :- "+max);


}
}