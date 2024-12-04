import java.util.Scanner;
class Mycafe{
public static void main(String[] args){
	boolean ordering = true;
Scanner sc=new Scanner(System.in);
System.out.println(" ");
System.out.println("                 |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
System.out.println("                 | Hello sir welcome to Infobeans cafe |"); 
System.out.println("                 |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
System.out.println(" ");
	//input from user for details.

    System.out.println("Sir, What's your good name ");
    String name=sc.nextLine();
    System.out.println(" ");
    System.out.println("Hello "+name +"ji");
    System.out.println("");
    System.out.println(" Please give some details " +name + "ji");
    System.out.println(" what is your Mobile number ");
    String mnumber=sc.nextLine();
    System.out.println(" Which city do you live ");
    System.out.println("");
    String city=sc.nextLine();

	//information check form user	

	System.out.println(" You information that give to me");
	System.out.println(" Your name ..........:- "+name);
	System.out.println(" Your mobile number..:- "+mnumber);
	System.out.println(" Your city name .....:- "+city);
	System.out.println(" ");

	System.out.println("|-----------------------------------|");        
	System.out.println("| sir please seat on table number 2 |");
        System.out.println("|-----------------------------------|");
	
	System.out.println("");

while(ordering){
		System.out.println(" ");
		System.out.println("|----------------|");
		System.out.println("| Sir Menu Card  |");
		System.out.println("|----------------|");
		System.out.println(" ");
		System.out.println(" coffee  ");
		System.out.println(" Cold coffee     $15");
		System.out.println(" Hot coffee      $20");
		System.out.println(" ");

		
		System.out.println("|--- Sir which would you like---- |");
		System.out.println("|     Cold coffee----Press 15     |");
		System.out.println("|     Hot coffee-----Press 20     |");
		

		int cold_coffee_price=15;
		int hot_coffee_price=20;

 		int coffe=sc.nextInt();
	 	switch(coffe)
		{
		case 15 :System.out.println("Thanku sir for order Cold coffe");
		break;
		case 20 :System.out.println("Thanku sir for order Hot coffe");
		break;
		}
	System.out.println(" ");

	System.out.println("would you like to order anything else ?");
        System.out.println(" ");
	System.out.println("Yes \t No");
	String other_order=sc.next();
	if(other_order.equalsIgnoreCase("no")){
	ordering = false;
	break;
	}
}// while loop end.

	//for payment method.

	System.out.println(" Sir which method do you pay ");
	System.out.println(" for___Cash press 1");
	System.out.println(" for___Online press 2");
	int pay=sc.nextInt();

		switch(pay)
		{
		case 1 : System.out.println("Thanku");
		break;
		case 2 : System.out.println("sir QR code ");
        	 System.out.println("************");
		 System.out.println("************");
		 System.out.println("************");
       	         System.out.println("************");
 		 break;
		}
System.out.println(" ");
System.out.println(" Thanku for visiting ");

}
}