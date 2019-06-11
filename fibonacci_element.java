import java.util.*;

class FibonacciElement {
	public static void main(String args[]) {
		System.out.print("enter the  value of n:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				n3=n1;
			}
			else if(i==2){
				n3=n2;
			}
			else {
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		
		}
		System.out.println("The nth element in the fibonacci series is"+n2);
		
		
	}

}
