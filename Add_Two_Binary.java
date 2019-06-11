package addTwoBinary;

import java.util.Scanner;

public class AddTwoBinary {
	public static void main(String args[]) {
		long b1,b2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter two binary numbers:");
		b1=sc.nextLong();
		b2=sc.nextLong();
		int sum[]=new int[10];
		int i=0,carry=0;
		while(b1>0 || b2>0) {
			sum[i++]=(int)(((b1%10)+(b2%10)+carry)%2);
			carry=(int)(((b1%10)+(b2%10)+carry)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if(carry==1) {
			sum[i]=carry;
		}
		System.out.println("output");
		while(i>=0){
			System.out.print(sum[i--]);	
		}
		
	}

}
