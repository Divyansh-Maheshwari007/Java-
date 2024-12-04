import java.util.Scanner;
class Paisa{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println(" ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ ");
System.out.println("| Note counting software |");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ ");
System.out.println(" ");
System.out.println("Enter amount ");
int n=sc.nextInt();
System.out.println(" ");

int rem;
int p_2000 = n/2000;
rem = n%2000;
System.out.println(" 2000 ke note    :- "+p_2000);
System.out.println(" total 2000 rupee:- "+p_2000*2000);
System.out.println(" ");

int p_500;
p_500 = rem/500;
rem = rem%500;
System.out.println(" 500  ke note    :- "+p_500);
System.out.println(" total 500 rupee :- "+p_500*500);
System.out.println(" ");

int p_200;
p_200 = rem/200;
rem = rem%200;
System.out.println(" 200  ke note    :- "+p_200);
System.out.println(" total 200 rupee :- "+p_200*200);
System.out.println(" ");

int p_100;
p_100 = rem/100;
rem = rem%100;
System.out.println(" 100  ke note    :- "+p_100);
System.out.println(" total 100 rupee :- "+p_100*100);
System.out.println(" ");

int p_50;
p_50 = rem/50;
rem = rem%50;
System.out.println(" 50   ke note    :- "+p_50);
System.out.println(" total 50 rupee:-"+p_50*50);
System.out.println(" ");

int p_20;
p_20 = rem/20;
rem = rem%20;
System.out.println(" 20   ke note    :- "+p_20);
System.out.println(" total 20 rupee  :- "+p_20*20);
System.out.println(" ");

int p_10;
p_10 = rem/10;
rem = rem%10;
System.out.println(" 10   ke note    :- "+p_10);
System.out.println(" total 10 rupee  :-"+p_10*10);
System.out.println(" ");

int p_5;
p_5 = rem/5;
rem = rem%5;
System.out.println(" 5    ke note    :- "+p_5);
System.out.println(" total 5 rupee   :- "+p_5*5);
System.out.println(" ");


int p_2;
p_2 = rem/2;
rem = rem%2;
System.out.println(" 2    ke chillar :- "+p_2);
System.out.println(" total 2 rupee   :- "+p_2*2);
System.out.println(" ");

int p_1;
p_1 = rem/1;
rem = rem%1;
System.out.println(" 1    ke chillar :- "+p_1);
System.out.println(" total 1 rupee   :- "+p_1*1);
System.out.println(" ");
}
}