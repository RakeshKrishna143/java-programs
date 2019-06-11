import java.util.*;

public class PalindromeForString {
	public static void main(String args[]) {
		System.out.print("enter the string: ");
		Scanner sc = new Scanner(System.in);
		String original= sc.nextLine();
		int l=original.length();
		String reverse="";
		for(int i=l-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse)) 
			System.out.println(original+" is palindrome");
		else
			System.out.println(original+" is not palindrome");
	}

}
