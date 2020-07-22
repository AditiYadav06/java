package compare;
import java.util.Scanner;

public class stringcompare {
		public static void main (String [] args){
	
		int a,b,max;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 numbers =");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The two numbers entered are " +a+ " and " +b);
		
		if (a>b)
			{
			max = a;
			}
			else
			{
			max = b;
			}
		System.out.println("The largest number is = " +max);
		}
	}
	