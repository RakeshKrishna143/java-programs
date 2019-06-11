import java.util.*;

public class PalindromeForNumber {
	public static void main(String args[]) {
		System.out.print("enter a number: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n,sum=0,lastDigit;
		while(m>0) {
			lastDigit=m%10;
			sum=sum*10+lastDigit;
			m=m/10;
		}
		
		if(n==sum)
			System.out.print(n+" is palindrome");
		else
			System.out.print(n+" is not palindrome");
	}

}
