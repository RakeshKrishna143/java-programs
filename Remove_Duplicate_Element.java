import java.util.*;

public class RemoveDuplicateElement {
	public static void main(String args[]) {
		System.out.println("enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the values: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		removeDupElement(a);
	}
	public static void removeDupElement(int a[]) {
		Arrays.sort(a);
		int temp[] =new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j]=a[a.length-1];
		for(int i=0;i<j+1;i++)
			System.out.print(temp[i]);
	}

}
