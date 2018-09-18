import java.util.Scanner;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if(n>0){
        	if(n%2==0){
        		System.output.printl("Even");
        	}
        	else{
        		System.output.printl("Odd");
        	}
        }
        else{
        	System.output.printl("invalid");
        }
    }
}
        	
   
