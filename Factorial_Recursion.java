import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String arg[]) {
		System.out.print("enter a number: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int result;
		result= fact(n);
		System.out.print(result);
	}
	public static int fact(int n) {
		if(n==1)
			return n;
		return n*fact(n-1);
	}

}
