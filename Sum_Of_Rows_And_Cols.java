import java.util.Scanner;

public class SumOfRowsAndCols {
	public static void main(String args[]) {
		/*System.out.print("enter number of rows and column: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a[][]=new int [n][n];
		System.out.print("enter the values: ");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();*/
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			int count1=0,count2=0;
			for(int j=0;j<a[0].length;j++) {
				count1+=a[i][j];
				count2+=a[j][i];
			}
			System.out.println("row"+(i+1)+":"+count1);
			System.out.println("column"+(i+1)+":"+count2);
		}
	}

}
