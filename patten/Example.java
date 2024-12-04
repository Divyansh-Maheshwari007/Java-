 
class Example
{
public static void main(String[] args){
int a=6;
int b=3;
int r=a%b;
System.out.println("1 = "+r);
System.out.println();

int x=5;
int y=10;
System.out.println("2 = "+ (x>y));
System.out.println();

// conver in binary 1&0=0  1&1=1  0&1=0   0&0=0;
int a1=4;
int b1=5;
System.out.println("3 = "+(a1 & b1));
System.out.println();

// bitwise or operator
int a2=4;
int b2=5;
System.out.println("4 = "+(a2 | b2));
System.out.println();

int a3=5;
int b3=3;
System.out.println("5 = "+(a3 / b3));
System.out.println();

int x1=4;
int y1=x1++;
System.out.println("6 = "+x1);
System.out.println("6 = "+y1);


Boolean a4=false;
Boolean b4=true;
System.out.println("7 = "+ (a4 || b4));
System.out.println();
d
int a5=1;
int b5=2;
int c5=3;
System.out.println("8 = "+ (a5<b5 && b5<c5));
System.out.println();


int a6=9;
int b6=4;
System.out.println("9 = "+ (a6 ^ b6));
System.out.println();

int a7=8;
int b7=3;
System.out.println("10 = "+ (a7 << b7));
System.out.println();

}}