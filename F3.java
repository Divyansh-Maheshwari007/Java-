class F3{
	int add()
	{
		int a = 10, b=20 ,c;
		c=a+b;
		return c;
		System.out.println("Hello");
	}
	public static void main(String args[]){
		F3 obj = new F3();
		int sum=obj.add();
		System.out.println("Result = "+ sum);
		
	}
}