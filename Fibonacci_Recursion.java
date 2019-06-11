import java.util.*;

public class FibonacciRecursion {
	public static void main(String args[]) {
		System.out.print("enter the n value: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(fib(n-1));
	}

	public static int fib(int n) {
		if(n<=1) 
			return n;
		return fib(n-1)+fib(n-2);
	}
	

}
