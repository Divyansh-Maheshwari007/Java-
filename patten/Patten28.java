 /*
1
222
33333
4444444
555555555
66666666666
7777777777777
888888888888888
99999999999999999
888888888888888
7777777777777
66666666666
555555555
4444444
33333
222
1
*/
class Patten28
{
public static void main(String[] args){
int n=9;

for(int i=1; i<=n; i++)
{ 		
  for(int j=1; j<i*2; j++){
   System.out.print(i);
}
System.out.println();
}

     for(int k=n-1; k>=1; k--)
     {
        for(int m=1; m<k*2; m++){
        System.out.print(k);
     }
       System.out.println();
     }




}}