
class Jalebi{
	public static void main(String[] args){
	
		

		int a[][]={{1,2,3,4},{5,6,7,8},{1,2,3,5},{5,6,7,8}};
			
	    for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length; j++)
			{
	
				System.out.print(a[i][j]);
			   
			}
		
		 System.out.println();
		}
		
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length; j++)
			{
				if(j==i || j==a.length-i-1)
				System.out.print(a[i][j]);
			    else
				System.out.print(" ");
			}
		
		 System.out.println();
		}
		
	}
}