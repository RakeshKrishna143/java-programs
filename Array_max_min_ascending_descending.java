import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		System.out.println("enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the values: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		max(a);
		min(a);
		ascendingOrder(a);
		System.out.println("");
		descendingOrder(a);
	}
	public static void max(int a[]) {
		int maxNum=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxNum)
				maxNum=a[i];
		}
		System.out.println(maxNum+" is the max");
		
		
	}
	public static void min(int a[]) {
		int minNum=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<minNum)
				minNum=a[i];
		}
		System.out.println(minNum+" is the min");
		
		
	}
	public static void ascendingOrder(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	protected static void descendingOrder(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}
