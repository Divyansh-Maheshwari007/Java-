class Reversen{
public static void main(String[] args){
int n = 1435;
int l = n%10;
int t = n/10%10;
int s = n/100%10;
int f = n/1000;
int r;
r=( (l*1000) + (t*100) + (s*10) + f );
System.out.println(r);
}
}