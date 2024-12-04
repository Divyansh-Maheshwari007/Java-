import java.util.Random;
import java.util.Scanner;
class Game{
public static void main(String[] args){
Random rand=new Random();
int n1=rand.nextInt(11);
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number bitween 1 to 10 ");
int n;
do
{
System.out.println("Enter a number");

 n=sc.nextInt();
 if(n==n1){
    System.out.println("You find a number");
}
}while(n1!=n);
}
}