/*
    1
   12
  123
 1234
12345

*/
class Patten16
{
public static void main(String[] args){

for(int i=1; i<=5; i++)
{
  	 for(int j=4; j>=i; j--){
  	 System.out.print(" ");
   	 }
	 for(int k=1; k<=i; k++){
	System.out.print(k);
	}

System.out.println();
}}}