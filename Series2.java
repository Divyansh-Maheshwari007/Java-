class Series2 {
public static void main(String [] args){
int i,n=3,sq;
double sum=0;

     for(i=1; i<=n; i++)
	{
        System.out.print("1/"+i+"^"+i+" ");
		
		System.out.print("+");
        sq=1;
		for(int j=1; j<=i; j++)
		{
		sq=sq*i;
		}
	sum=sum+(1.0/sq);
	}

System.out.println();
System.out.println("Total sum of Series :- "+sum);

}}
/*
1/1^1 1/2^2 1/3^3
Total sum of Series :- 1.287037037037037
*/