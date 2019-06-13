import java.util.Scanner;

public class MatrixSparse {
	public static void main(String args[]) {
		System.out.print("enter number of rows and column: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a[][]=new int [n][n];
		System.out.print("enter the values: ");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==0)
					count+=1;
			}
		}
		System.out.print(count);
		if( count>n*n/2)
			System.out.print("it is sparse matrix");
		else
			System.out.print("it is not a sparse matrix");
		
	}

}
