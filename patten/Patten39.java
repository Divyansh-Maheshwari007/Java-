/*
0
01
010
0101
01010
*/

public class Patten39 {
    public static void main(String [] args){

 for(int i=5; i>=1; i--){

     for(int j=5; j>=i; j--)
 	{
        if(j%2!=0)
	System.out.print("0");
        else
        System.out.print("1");
}

 System.out.println();
  }


}    
}





