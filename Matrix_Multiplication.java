import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String args[]){  
		 
		    
		    
		/*System.out.println("enter number of rows and column: ");
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
				b[i][j]=sc.nextInt();    */
		int a[][]={{1,1,1},{2,2,2}};    
		int b[][]={{1,1,},{2,2},{3,3}};  
		int c[][]=new int[a.length][b[0].length];
		 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				c[i][j]=0;
				for(int k=0;k<b.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		 
		   
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<b[0].length;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}

}
