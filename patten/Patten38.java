public class Patten38 {
    public static void main(String [] args){

 for(int i=5; i>=1; i--){

     for(int j=5; j>=i; j--)
 	{
        if(j%2==0)
	System.out.print("0");
        else
        System.out.print("1");
}

 System.out.println();
  }
}    
}

/*
1
10
101
1010
10101
*/