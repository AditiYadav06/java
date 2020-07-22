import java.util.Scanner;
 
public class palindromebuffer {
    public static void main(String[] args) {
         
        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);
         
        //Original string
        String originalstring = in.nextLine();
         
        //Reverse string
        String reverseString = new StringBuffer(originalstring).reverse().toString();
         
        // Check palindrome string
        if (originalstring.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}