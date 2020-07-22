public class methodofstringclass{
	
	public static void main(String args[]){
 
	String s=" Aditi";
	String s1="Aditi is learning Java programming language. Java is a popular language."; 
 
	System.out.println("UPPERCASE="+s.toUpperCase());
	System.out.println("LOWERCASE="+s.toLowerCase());
	System.out.println("NO CHANGE="+s);

   //Using trim 
	System.out.println("SPACE COUNTED ="+s); 
	System.out.println("SPACE TRIMED  ="+s.trim());
	
	//StartsWith ENDSWITH
	System.out.println("IF THE STRING STARTS WITH SPACE ="+s.startsWith(" ")); 
	System.out.println("IF THE STRING STARTS WITH a     ="+s.startsWith("a"));
	System.out.println("IF THE STRING ENDS WITH d       ="+s.endsWith("d"));
	
	//charAt
	System.out.println("FIRST CHARACTER="+s.charAt(1));  
	System.out.println("THIRD CHARACTER="+s.charAt(3));
	System.out.println("LENGTH OF THE STRING="+s.length());

	//replace
String replaceString=s1.replace("Java","C");    
System.out.println(replaceString);    
 }
}
