																										import java.util.Scanner;												
class Armstrong1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
        int m=sc.nextInt();

	for(int j=1; j<=m; j++){
	int num=j;
	int orig_num = num;
	int sum = 0;
	int rem;
	int temp2 = num;
	int count = 0;
	
	while(num != 0){
		count++;
		rem = num % 10;
		num = num / 10;
	}
	while(temp2 != 0){
	int digit = temp2 % 10;
	int power = 1;	
	 
	for(int i = 1; i <= count; i++){
		power = power * digit;
	}
	sum += power;
	temp2 /= 10;
	}
	//System.out.println(sum);
	if(sum == orig_num){
	System.out.println("Number is ArmStrong :- " + sum);
	}
}	
}	
}