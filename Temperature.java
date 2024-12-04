class Temperature{
public static void main(String[] args){
int tem=110;
if(tem<0)
System.out.println("Freezing");
else if(tem>=0 && tem<=30)
{
if(tem<15)
System.out.println("cold");
if (tem>15)
System.out.println("varm");
}
else 
System.out.println("hot");
}}
