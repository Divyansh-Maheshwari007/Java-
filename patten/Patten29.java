/*
1
123
12345
1234567
123456789
1234567
12345
123
1
*/ 
class Patten29
{
public static void main(String[] args){
int n=5;

for(int i=1; i<=n; i++)
{ 		
  for(int j=1; j<i*2; j++){
   System.out.print(j);
}
System.out.println();
}

     for(int k=n-1; k>=1; k--)
     {
        for(int m=1; m<k*2; m++){
        System.out.print(m);
     }
       System.out.println();
     }




}}