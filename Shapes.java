// circle   pi*r*r
// Rectange L*B
// Square S*S
import java.util.Scanner;
class Shapes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Which Shapes Area do you want ");
System.out.println("for Circle press 1");
System.out.println("for Rectangle press 2");
System.out.println("for Square press 3");

int n=sc.nextInt();
switch(n)
{
  case 1 : System.out.println("Enter the Radius of Circle");
           int r=sc.nextInt();
           System.out.println("Area of Circle :- "+(3.14*r*r));
  break;
  case 2 : System.out.println("Enter the Length and Breath of Rectangle");
           int b=sc.nextInt();
           int l=sc.nextInt();
           System.out.println("Area of Rectangle :-"+(b*l));
  break;
  case 3 : System.out.println("Enter the Sides of Square ");
           int s=sc.nextInt();
           System.out.println("Area of Square :-"+(s*s));
  break;
  default: System.out.println("given number is wrong");
}  
	
}}
