import java.util.Scanner;
class Age
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int p;
do{
System.out.println("Enter a number");
int n=sc.nextInt();

if(n<10)
System.out.println("you are a child");
else if(n>=10 && n<=18)
System.out.println("you are a Teenager");
else if(n>18 && n<=40)
System.out.println("you are a Adult");
else 
System.out.println("you are a Senior citizen");

System.out.println("You want find more :- press 1");
System.out.println("For end program :-    press 2");
 p=sc.nextInt();
}while(p==1);

}}