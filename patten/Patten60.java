/*
 + + + + + + + + + + + + + + +
 + +                       + +
 +   +                   +   +
 +     +               +     +
 +       +           +       +
 +         +       +         +
 +           +   +           +
 +             +             +
 +           +   +           +
 +         +       +         +
 +       +           +       +
 +     +               +     +
 +   +                   +   +
 + +                       + +
 + + + + + + + + + + + + + + +
*/
class Patten60 {
    public static void main(String [] args){
int n=15;
 for(int i=1; i<=n; i++){

     for(int j=1; j<=n; j++)
 	{
        if( j==1 || i==1 || j==n || i==n || j==i || i-1==n-j)
        System.out.print(" +");
        else
         System.out.print("  ");
	}

 System.out.println();
  }
}    
}