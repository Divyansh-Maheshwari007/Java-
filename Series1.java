class Series1  {
public static void main(String [] args){
int i,n=12;
double sum=0;
for(i=1; i<=n; i++){
System.out.print("1/"+i+"^2  ");
sum=sum+(1.0/(i*i));
}
System.out.println();
System.out.println("Total sum of Series :- "+sum);

}}
/*
1/1^2  1/2^2  1/3^2  1/4^2  1/5^2  1/6^2  1/7^2  1/8^2  1/9^2  1/10^2  1/11^2  1/12^2
Total sum of Series :- 1.5649766384209025
*/