import java.util.Scanner;

public class MatrixIdentity {
	public static void main(String args[]) {
		System.out.print("enter number of rows and column: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag = true;
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
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if( (i==j && a[i][j]!=1) || (i!=j && a[i][j]!=0) ) {
					flag=false;
					System.out.print(" The matrix is not identity");
					break;
				}
		if(flag) {
			System.out.print(" The matrix is identity");
		}
	}

}
