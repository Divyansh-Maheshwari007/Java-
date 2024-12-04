class Studentgreat{
public static void main(String[] args){
int marks=96;
if (marks<100 && marks>91)
System.out.println("Student pass with great A : "+marks);
else if(marks<90 && marks>81)
System.out.println("Student pass with great B : "+marks);
else if(marks<80 && marks>71)
System.out.println("Student pass with great C : "+marks);
else if(marks<70 && marks>61)
System.out.println("Student pass with great D : "+marks);
else if(marks>60 && marks<31)
System.out.println("Student pass with great D : "+marks);
else if(marks<30)
System.out.println("Student is fail "+marks);
}}