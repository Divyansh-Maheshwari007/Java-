import java.util.Scanner;
class Season{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Which Season do you want to find Accouding to Month");
int n=sc.nextInt();
switch(n)
{
  case 1 : System.out.println("January :- Winter Season and Pre-winter Season");
  break;
  case 2 : System.out.println("February :-Winter Season and Spring Season ");
  break;
  case 3 : System.out.println("March :-Spring Season and Summer Season ");
  break;
  case 4 : System.out.println("April :-Summer Season");
  break;
  case 5 : System.out.println("May :-Sumber Season ");
  break;
  case 6 : System.out.println("June :-Monsoon Season ");
  break;
  case 7 : System.out.println("july :-Monsoon Season ");
  break;
  case 8 : System.out.println("August :-Monsoon Season ");
  break;
  case 9 : System.out.println("Septamber :- Monsoon Season");
  break;
  case 10 : System.out.println("Octobar :- Autumn Season");
  break;
  case 11 : System.out.println("Novembar :-Autumn Season ");
  break;
  case 12: System.out.println("December:- Pre-Winter Season");
  break;
  default: System.out.println("given number is wrong");
}  
	
}}
