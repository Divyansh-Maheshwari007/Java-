 
class Patten36
{
public static void main(String[] args){
int n=5;

for(int i=5; i>=1; i--)
{ 		
 for(int j=5; j>=i; j--){
 if(j==i/2)
  System.out.print(i);
}
System.out.println();
}
}}