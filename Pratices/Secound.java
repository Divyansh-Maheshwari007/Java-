import java.util.Scanner;
class  Secound
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a secound");
int n=sc.nextInt();
int h;
int m;
m=n/60;
h=m/60;
System.out.println("Which you want to find Minutes or Hours");
System.out.println();
System.out.println("Minites for :- press 1");
System.out.println("Hours for :- press 2");
int v=sc.nextInt();

switch(v){
case 1:
System.out.println("minutes :-"+m);
break;
case 2:
System.out.println("hours :-"+h);
}


}}