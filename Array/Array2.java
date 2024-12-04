import java.util.Scanner;
class Max{
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		int i;
		int max=0;
		for(i=0; i<a.length; i++){
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number "+max);




	}
}
		