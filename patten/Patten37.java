/*
5
43
332
2221
11111
*/

public class Patten37 {
    public static void main(String [] args){

 for(int i=5; i>=1; i--){

     for(int j=5; j>=i; j--)
 	{
        if(j==i && i!=5 && i!=1	)
	System.out.print(i-1);
        else
        System.out.print(i);
}

 System.out.println();
  }


}    
}
