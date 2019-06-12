import java.util.*;

public class MatrixAddition {
	public static void main(String args[]) {
		System.out.println("enter number of rows and column: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		System.out.println("enter the values of A matrix:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("enter the values of B matrix:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				b[i][j]=sc.nextInt();
				
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		System.out.println("A matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("B matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("C matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
			
				
			
	}

}
