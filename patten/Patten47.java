/*
  * * * * * * * * * *
 *                 *
 *                 *
 *                 *
 * * * * * * * * * *
*/
 class Patten47 {
    public static void main(String [] args){
int n=5;
 for(int i=1; i<=n; i++){

     for(int j=1; j<=n*2; j++)
 	{
        if(i==1 || j==1 || n*2==j )
        System.out.print(" *");
        else
         System.out.print("  ");
	}

 System.out.println();
  }
}    
}