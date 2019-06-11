import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String args[]) {
		System.out.print("enter a number: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n,r,sum=0;
		while(m>0) {
			r=m%10;
			sum=(int) (sum+Math.pow(r,3));
			m=m/10;
		}
		if(n==sum)
			System.out.print(n+" is armstrong number");
		else 
			System.out.print(n+" is not armstrong number");
		
	}

}
