class Paskal{
	public static void main(String [] args){
		int n=4;
		for(int i=0; i<=n; i++){
			
			for(int j=n; j>=i; j--){
				System.out.print(" ");
			}
			int p=1;
			for(int k=0; k<=i; k++){
				System.out.print(" "+p);
				p=(p*(i-k)/(k+1));
			}
			System.out.println();
		}
	}
}