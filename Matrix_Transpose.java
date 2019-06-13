import java.util.*;
public class MatrixTranspose {
	public static void main(String args[]) {
		System.out.print("enter number of rows and column: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		System.out.print("enter the values: ");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		int b[][]=new int [n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				b[i][j]=a[j][i];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
			
				
	}

}
