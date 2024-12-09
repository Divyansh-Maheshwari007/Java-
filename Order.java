// WAP to process order details as 
//data members : infomation, qty, rate, orderNO, customer number, customer Name, amount, dis ,net
// Member Function : get order- details() : void get customer() 
// put order (), putcustomer()
// Instruction : order - details would return the amount of order then main function will calculate discount & net amount

import java.util.Scanner;
class Order
{
	int item_number,costmer_number,order_no,qty;
	String c_name;
	float rate,amt;
	Scanner s=new Scanner(System.in);
	float getorder_details()
	{	
		System.out.print("Enter order number :");
		order_no=s.nextInt();
		System.out.print("Enter Item no. :");
		item_number=s.nextInt();
		System.out.print("Enter quantity :");
		qty=s.nextInt();
		System.out.print("Enter rate :");
		rate=s.nextFloat();
		amt=qty*rate;
		return amt;
	}
	void get_customer()
	{	
		
		System.out.print("Enter Customer no. :");
		costmer_number=s.nextInt();
		s.nextLine();
		System.out.print("Enter Customer name :");
		c_name=s.nextLine();
		
	}
	void put_order()
	{	
		System.out.println("Order number :"+order_no);
		System.out.println("Item no. :"+item_number);
		System.out.println("quantity :"+qty);
		System.out.println("rate :"+rate);
	}
	void put_customer()
	{	
		
		System.out.println("Customer no. :"+costmer_number);	
		System.out.println("Customer name :"+c_name);	
	}
	
	public static void main(String [] args)
	{
		Order o1=new Order();
		float amt=o1.getorder_details();
		o1.get_customer();
		System.out.println();
		System.out.println();
		o1.put_order();
		System.out.println();
		System.out.println();
		o1.put_customer();
		float discount,net;
		if(amt>=50000)
		{
			discount=25;
		}
		else if(amt>=20000)
		{
			discount=15;
		}
		else
		{
			discount=5;
		}
		
		float dis_amount=amt*(discount/100);
		net=amt-dis_amount;
		System.out.println();
		System.out.println();
		System.out.println("After discount amount : "+net);
	}
}