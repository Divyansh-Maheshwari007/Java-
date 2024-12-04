import java.util.Scanner;
class Dowhile1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
do{
n--;
System.out.println(n);
}while(n>1);


}}