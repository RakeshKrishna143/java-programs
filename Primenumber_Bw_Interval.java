import java.util.*;

public class PrimenumberBwDInterval {
	public static void main(String args[]) {
		System.out.print("enter the  value of n: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(isPrime(i))
				System.out.println(i+" is a prime number");
		}
		
	}
	public static boolean isPrime(int num) {
		if(num==0 || num==1)
			return false;
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}
