import java.util.*;

public class FibonacciSeries {
	public static void main(String args[]) {
		System.out.print("enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println("The fibonacci series is:");
		for(int i=1;i<=n;i++) {
			if(i==1) {
				n3=n1;
			}
			else if(i==2) {
				n3=n2;
			}
			else {
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.println(n3);
		}
	}

}
