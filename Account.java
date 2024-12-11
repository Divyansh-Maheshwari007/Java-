
import java.util.Scanner;

class Account{
	void check(int pin){
		Scanner sc = new Scanner(System.in);
		int pass;
		System.out.println("--------Welcome--------");
		do{
			System.out.print("Pin = ");
			pass = sc.nextInt();
			if(pass != pin)
				System.out.println("Incorrect_Pin!!!");
		}while(pass != pin);
	}

	int choise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("What do You What to Do");
		System.out.println("1. Change_Pin\t\t3. Deposite\n2. Check_Balance\t4. Withdraw\n5. Check_pin\t\t6. Exit");
		System.out.print("Press(1 to 5) = ");
		int c = sc.nextInt();
		while(c < 1 && c > 6){
			System.out.println("Please Enter Between 1 to 5");
			c = sc.nextInt();
		}
		return c;
	}
	
	int change_Pin(){
		Scanner sc = new Scanner(System.in);
		int a,b;
		do{
			System.out.print("New_Pin = ");
			a = sc.nextInt();
			System.out.print("Re-Enter_Pin = ");
			b = sc.nextInt();
			if(a != b)
				System.out.println("Pin Doesn't Match");
			else if(a < 100000 && b > 1000000)
				System.out.println("Pin Should Have 6 Digits");
			else{
				System.out.println("Pin Updated Successfull");
				break;
			}
		}while(a != b);
		return a;
	}
	
	void balance(float a){
		System.out.println("Balance = "+a);
	}
	
	float deposite(float a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		float b = sc.nextFloat();
		float nb = b + a;
		System.out.println("Amount Diposited Successfully");
		return nb;
	}
	
	float withdraw(float a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		float b = sc.nextFloat();
		if(b > a)
			System.out.println("Insufficient_Balance!!");
		else{
			System.out.println("Withdrawal Successfull");
			float nb = a - b;
			return nb;
		}
		return a;
	}
	
	public static void main(String args[]){
		Account account = new Account();
		int pin = 123654;
		float b = 100000f;
		int c;
		account.check(pin);
		do{
			c = account.choise();
			switch(c){
				case 1 :  pin = account.change_Pin();
						break;
				case 2 : account.balance(b);
						break;
				case 3 : b = account.deposite(b);
						break;
				case 4 : b = account.withdraw(b);
						break;
				case 5 : System.out.println(pin);
						break;
				case 6 : System.out.println("Thank_You Sir");
			}
			
		}while(c != 6);
	}
}