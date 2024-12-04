// print prime number between given by user
import java.util.Scanner;
class prime_number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
int cout=0;
    for(int j=1; j<=i; j++)
    {
    if(i%j==0)
    {
    cout++;
    }}
 if(cout==2){
System.out.println(i);
}                   
}

}
}