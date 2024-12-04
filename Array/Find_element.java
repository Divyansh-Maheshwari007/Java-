import java.util.Scanner;
class Find_element{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		
		 for(int i=0; i<ar.length; i++){
		System.out.print("Enter elements :- ");
		ar[i]=sc.nextInt();
		}
		
		int l=0, h=ar.length-1,mid=0,flag=0,s;
		
		System.out.println("Enter element to Search");
		s=sc.nextInt();
		
		for(int i=0; i<ar.length; i++){
			mid=(l+h)/2;
			if(ar[mid]==s){
				flag=1;
				break;
			}
			else if(s>ar[mid]){
				l=mid+1;
			}
			else
				h=mid-1;
			}

			if(flag==1)
				System.out.println("Element is present");
			else
				System.out.println("Element is not present");
		
	}
}