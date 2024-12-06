import java.util.Scanner;
class Bill{
	float qty,rate,dis,net_amount;
	void get_Details(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter item name:- ");
		String Name=sc.nextLine();
		System.out.print("Enter quantity :- ");
		qty = sc.nextInt();
		System.out.print("Enter Rate of "+Name+" item");
		rate = sc.nextInt();
		
		net_amount = qty*rate;
		
		System.out.println("-------------------------------");
		System.out.println("         Reliance store        ");
		System.out.println("Name of items :-");
		System.out.println(Name+"-"+qty+"rate"+rate);
		System.out.println("Total amout to pay :"+net_amount);
		
		if(net_amount >100 ){
		System.out.println("");
		System.out.println("Discount of 10% ");
		dis=(net_amount*10)/100;
		System.out.println("Discount amount :-"+dis);
		System.out.println("net_amount to pay :" +(net_amount-dis));
		System.out.println("--------------------------------------");
		}
		
	}
	public static void main(String[] args){
	Bill d=new Bill();	
	d.get_Details();
	}
}