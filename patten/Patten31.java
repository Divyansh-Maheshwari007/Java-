 /*
02345
10345
12045
12305
12340
*/

class Patten31
{
public static void main(String[] args){
int n=5;

for(int i=1; i<=5; i++)
{ 		
  for(int j=1; j<=5; j++){
   if(j==i)
   System.out.print("0");
   else
   System.out.print(j);
 }

System.out.println();
}}}