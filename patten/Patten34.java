import java.util.Scanner;
class Patten34
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter how many rows you want :");
int num=sc.nextInt();
int c,j,sq,r;

for(int i=0; i<num; i++)
{ 		
  for(int k=i; k<num; k++)
  {
  System.out.print(" ");
  }
  
  for(int z=i; z<0; z++)
  {
  System.out.print("1");
  }
  c=0;
  sq=1;
  for(int x=0; x<i; x++){
   sq=sq*11;
  }
   for(int s=sq; sq>0;)
   {
   r=sq%10;
   System.out.print(r+" ");
   sq=sq/10;
   }
  System.out.println();
}

}}
/*
         1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1
    1 5 0 1 6 1
   1 6 5 1 7 7 1
  1 7 1 7 8 4 9 1
 1 8 8 8 5 3 4 1 2 
*/