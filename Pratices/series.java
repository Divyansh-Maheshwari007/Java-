import java.util.Scanner;
class Maximum_number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int n1=sc.nextInt();
System.out.println("Enter second number");
int n2=sc.nextInt();
System.out.println("Enter third number");
int n3=sc.nextInt();
System.out.println("Enter forth number");
int n4=sc.nextInt();
System.out.println("Enter fivth number");
int n5=sc.nextInt();

if( n1>n2 && n1>n3 && n1>n4 && n1>n5 )
System.out.println("Largest number :- "+n1);

else if( n2>n3 && n2>n4 && n2>n5 )
System.out.println("Largest number :- "+n2);

else if( n3>n4 && n3>n5 )
System.out.println("Largest number :- "+n3);

else if( n4>n5 )
System.out.println("Largest number :- "+n4);

else
System.out.println("Largest number :- "+n5); 

}
}