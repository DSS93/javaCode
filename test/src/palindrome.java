import java.util.*;
public class palindrome {
	
	public static void main(String args[]){
		
		 String original, reverse = "";
	
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      Scanner inn = new Scanner(System.in);  
	      
	      original = inn.nextLine(); 
	      int length = original.length();   
	      
	      for ( int i = length - 1; i >= 0; i-- ) 
	      {
	         reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse))  
	      {
	         System.out.println("Entered string/number is a palindrome.");  
	      }
	      else  
	      {
	         System.out.println("Entered string/number isn't a palindrome."); 
	      }		
	}

}
