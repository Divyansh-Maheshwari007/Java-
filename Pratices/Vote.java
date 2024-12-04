import java.util.Scanner;
class Vote
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int p;
do{
System.out.println("Enter a number");
int n=sc.nextInt();

if(n<18)
System.out.println("You are not Eligible to vote");
else
System.out.println("You are Egligible to vote");


System.out.println("You want find more :- press 1");
System.out.println("For end program :-    press 2");
 p=sc.nextInt();
}while(p==1);

}}