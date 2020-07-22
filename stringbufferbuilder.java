import java.util.*;
class stringbufferbuilder {
	public static void main (String [] args)
	{
		String s="Aditi";
		int a;
		
		//declaring stringbuffer and builder
		
		StringBuffer  s1= new StringBuffer(s);
		StringBuilder s2= new StringBuilder(s);
		
		System.out.println("Original string is         ="+s);
		System.out.println("Using stringbuffer is      ="+s);
		System.out.println("Original stringbuilder is  ="+s);

		//Functions of stringbuffer
		//append 
		s1.append(" Yadav");
		System.out.println("Appended string is         ="+s1);
		
		//delete
		s1.delete(5,7);
		System.out.println("String deleted is          ="+s1);
	
		//insert
		s1.insert(5,"Rajendra");
		System.out.println("Inserted string            ="+s1);
		
		//reverse
		s1.reverse();
		if (s.equals(s1.toString()))
		{
		System.out.println("STRING IS PALINDROME.");}
		
		else
		
		{
		
				System.out.println("STRING IS NOT PALINDROME.");
		}
		
		//FUNCTIONS OF StringBuilder
		//Append
		s2.append("Yadav");
		System.out.println("Appended string is         ="+s2);
		
		//capacity
		a=s2.capacity();
		System.out.println("Capacity of string is      ="+a);
		
		//delete
		s2.delete(3,4);
		System.out.println("Deleted string is          ="+s2);
		
		//insert
		s2.insert(5,"Rajendra");
		System.out.println("Inserted string is         ="+s2);
		
		
		
		
		
			



	}
}
		
