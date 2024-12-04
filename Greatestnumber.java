class Greatestnumber{
public static void main(String[] args){
int a=10;
int b=10;
int c=12;
if(a>b&&a>c)
System.out.println("a is greatest :"+a);
else if(b>c&&b>a)
System.out.println("b is greatest :"+b);
else if(c>a&&c>b)
System.out.println("c is greatest :"+c);
else if(a==b && b==c)
System.out.println("all numbers are equal:");
else if(a==b || b==c || c==a)
System.out.println("two number are equal:");
}}
