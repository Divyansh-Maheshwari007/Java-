import java.util.Scanner;
class Student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//these is for size of array
		System.out.print("How many student data you want to enter ");
		int n=sc.nextInt();
		System.out.println();
		int Student[] = new int[n];
		
		String  Name[] = new String[n];
		String  Roll[] = new String[n];
		
		int Maths[] = new int[n];
		int English[] = new int[n];
		int Hindi[] = new int[n];
		int Economics[] = new int[n];
		int Phyical_E[] = new int[n];
		//float Per[] = new float[n];
		String p=" ",p2=" ",p3=" ",p4=" ",p5=" ",p6=" ";
		
		
		//this is for  Enter the name of student
		for(int i=0; i<n; i++)
		{
			sc.nextLine();
			System.out.print(" Enter The name of "+(i+1)+"st Student : ");
			Name[i] = sc.nextLine();
			System.out.print(("Enter Roll of "+Name[i])+" : ");
			Roll[i] = sc.nextLine();
		    System.out.println();
			
			System.out.print((Name[i])+" Student Maths marks :  " );
			Maths[i] = sc.nextInt();
			System.out.print((Name[i])+" Student English marks : ");
			English[i] = sc.nextInt();
			System.out.print((Name[i])+" Student Hindi marks : ");
			Hindi[i] = sc.nextInt();
			System.out.print((Name[i])+" Student Economics marks : ");
			Economics[i] = sc.nextInt();
			System.out.print((Name[i])+" Student Phyical_E marks : ");
			Phyical_E[i] = sc.nextInt();
			System.out.println();
            
		}  
		
		
             float Total[] = new float[n];
		    			
			for(int i=0; i<n; i++)
			{
				Total[i]=Maths[i]+English[i]+Hindi[i]+Economics[i]+Phyical_E[i];
				//Per[i]=(Total[i]*100)/500;
				System.out.println("-----------------------------------------------|");
				System.out.println("|             Infobeans Result                  ");
				System.out.println("| Name      "+(Name[i])+"                       ");
				System.out.println("| Roll No.  "+(Roll[i])+"                       ");
				System.out.println("|                                               ");
				System.out.println("|              SUBJECT MARKS                    ");
				System.out.println("|                                               ");
				System.out.println("| English   :"+(English[i])+"                   ");
				System.out.println("| Hindi     :"+(Hindi[i])+"                     ");
				System.out.println("| Maths     :"+(Maths[i])+"                     ");
				System.out.println("| Economics :"+(Economics[i])+"                 ");
				System.out.println("| Phyical_E :"+(Phyical_E[i])+"                 ");
				System.out.println("                                                ");
			    System.out.println("| Total     :"+(Total[i])+"                     ");
			    //System.out.println("| Percentage:"+(Total[i])+"                     ");
				System.out.println("|----------------------------------------------|");
			}
			
		   
			float max=0;
			float max1=0;
			float max2=0;
			float max3=0;
			float max4=0;
			
			float topper=0;
		
         //for maximun number of marks		
		for(int  i=0; i<Maths.length; i++)
		{
			
			if(topper<Total[i]){
			topper=Total[i];
			p3=Name[i];
			}
			
			if(max<Maths[i]){
			max=Maths[i];
			p=Name[i];
			}
			
			if(max1<English[i]){
			max1=English[i];
			p2=Name[i];
			}
			
			if(max2<Economics[i]){
			max2=Economics[i];
			p3=Name[i];
			}
			
			if(max3<Hindi[i]){
			max3=Hindi[i];
			p4=Name[i];
			}
			if(max4<Phyical_E[i]){
			max4=Phyical_E[i];
			p5=Name[i];
			}
			
		
		}	
		
		
		System.out.println();
		System.out.println(p+" is Maximum marks of Maths is "+max1);
		System.out.println(p2+" is Maximum marks of English is  "+max);
		System.out.println(p3+" is Maximum marks of Economics is  "+max2);
		System.out.println(p4+" is Maximum marks of Hindi is  "+max3);
		System.out.println(p5+" is Maximum marks of Phyical_E is  "+max4);
		System.out.println();
		System.out.println(p3+"  Toper of the class : "+topper);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		