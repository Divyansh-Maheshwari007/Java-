// WAP to accept deposit and withdrawal amounts from user and then finally display the current balace.b 
import java.util.Scanner;
class Bank{
	Scanner sc = new Scanner(System.in);
	int account_number;
	double opening_balance;
	double closeing_balance=0;
	double net_amount=0;
	double curren_balance;
	double add_fund;
	double withdrawal_amount;
	
	void account_detail(){
		
		System.out.println("Enter account number");
		account_number = sc.nextInt();
		System.out.println("Enter opening_balance ");
		opening_balance = sc.nextInt();
		}
	void process(){
		System.out.println("press ! 1 ! for add fund  ");
		System.out.println("press ! 2 ! for withdrawal");
		System.out.println("press ! 3 ! for bank Details");
		int n=sc.nextInt();
		if(n==1){
			System.out.print(" How much fund you add : ");
			add_fund = sc.nextInt();
		}
		else if(n==2){
			System.out.print(" How much amount you withdrawal : ");
			withdrawal_amount = sc.nextInt();
		}
		else if(n==3){
			System.out.println("Your bank details ");
			System.out.println("Account number  :"+account_number);
			System.out.println("Opening balance :"+opening_balance);
		}
		
	}	
		
	void closing(){
		net_amount=(opening_balance-withdrawal_amount+add_fund);
		if(net_amount<1)
		System.out.print("Your account not have enough amount");
	    else
		System.out.println("your curren balace :"+net_amount);	
	}
	public static void main(String[] args){
		Bank d=new Bank();
		d.account_detail();
		d.process();
		d.closing();
	}
}