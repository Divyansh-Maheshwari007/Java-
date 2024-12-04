 /*
 0
 0 1 0
 0 2 3 4 0
 0 5 6 7 8 9 0
 0 10 11 12 13 14 15 16 0
*/
class Patten27
{
public static void main(String[] args){
int n=1;

for(int i=1; i<=5; i++)
{ 		
  for(int j=1; j<i*2; j++){
   if(j==1|| j==i*2-1)
   System.out.print(" 0");
   else{
   System.out.print(" "+n);
    n++; }
 }

System.out.println();
}}}