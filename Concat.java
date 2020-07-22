//CONCAT TWO STRING AND STORE IN ONE.

public class Concat {

		public static void main(String[] args)
    {
        String str1 = "Hello!! ";
        String str2 = "Welcome to Java class";
		System.out.println();
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2); 


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

		System.out.println("The concatenated string: " + str3);
		System.out.println();
    }
}