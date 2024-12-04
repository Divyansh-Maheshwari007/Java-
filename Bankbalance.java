import java.util.Scanner;
class Bankbalance{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("");
 long AB=2000000;
System.out.println("Total amount in account " +AB);
System.out.println("");
System.out.println("Enter withdraw amount");
long WB=sc.nextInt();
long new_balance=AB-WB;
if(WB>AB)
System.out.println("insufficient balance ");
else if(WB%10!=0)
System.out.println("Invalid denomination");
else if(new_balance>1000000){
System.out.println(" ");
System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
System.out.println("|you are a millionaire  |");
System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
}
 



}}