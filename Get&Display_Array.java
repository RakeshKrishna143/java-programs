import java.util.*;

public class GetArray {
	public static void main(String args[]) {
		System.out.print("enter number of elements in the array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the values:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		display(a);
	}
	public static void display(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
