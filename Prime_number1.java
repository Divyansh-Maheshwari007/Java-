 
class Prime_number1
{
public static void main(String[] args){
int n=8;
int flag =0;

for(int i=1; i<n; i++){
flag = 0;
    for(int j=2; j<i; j++)
    { 		
       if(n%j==0){
       flag=1;
       break;
                 }}
   if(flag==1)
   System.out.println("Not prime" + i);
   else
   System.out.println("prime" + i);
}}}