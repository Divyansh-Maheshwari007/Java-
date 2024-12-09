//function with no arrgument with no return type
class F4{
	int add()
	{
		int a = 10, b=20;
		
		return(a+b);
		
	}
	public static void main(String args[]){
		F4 obj = new F4();
		int sum=obj.add();
		System.out.println("Result = "+ sum);
		
	}
}