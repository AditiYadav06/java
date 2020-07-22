import java.util.Scanner;

public class arrayn {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Sizeofarray, i, Sum = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Sizeofarray = sc.nextInt();	
		
		int [] a = new int[Sizeofarray];
		
		System.out.print(" Please Enter " + Sizeofarray + " elements of an Array  : ");
		for (i = 0; i < Sizeofarray; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Sizeofarray; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("\n The Sum of All Elements in this Array = " + Sum);
				
				
		if(Sum % 5 == 0) 
		
		{
			System.out.println("\n Given number " + Sum + " is Divisible by 5 "); 
		}
		else
		{
			System.out.println("\n Given number " + Sum + " is Not Divisible by 5 "); 
		}
		
		if(Sum % 3 == 0) 
		{
			System.out.println("\n Given number " + Sum + " is Divisible by 3 "); 
		}
		else
		{
			System.out.println("\n Given number " + Sum + " is Not Divisible by 3 "); 
		}
	}
}