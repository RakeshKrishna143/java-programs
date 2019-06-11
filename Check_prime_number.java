import java.util.*;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		int m=n/2,flag=0;
		if(n==0 || n==1)
			System.out.print(n+" is not a prime number");
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.print(n+" is not a prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.print(n+" is a prime number");
		}
	}

}
