import java.util.*;

public class LargestNumber {
	public static void main(String args[]) {
		System.out.println("enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the values: ");
		int a[]=new int[n];
		//Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		thirdMaxManualSort(a);
		//thirdMaxArraySort(a);
		//thirdMaxCollectionSort(a);
	}
	public static void thirdMaxManualSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]){
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print(a[a.length-3]);
	}
	public static void thirdMaxArraySort(int a[]) {
		Arrays.sort(a);
		System.out.print(a[a.length-3]);
	}
	public static void thirdMaxCollectionSort(Integer a[]) {
		
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		System.out.print(list.get(a.length-3));
		
	}

}
