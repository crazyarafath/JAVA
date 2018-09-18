import java.util.Scanner;
class Char
{
	public static void main(String[ ] arg)
	{
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	i=sc.nextInt();
	j=sc.nextInt();
	k=sc.nextInt();
	if(i>j&&i>k){
		System.out.println(i);}
	else if(j>i&&j>k){
		System.out.println(j);}
	else{
		System.out.println(k);}	
	}
}
	
