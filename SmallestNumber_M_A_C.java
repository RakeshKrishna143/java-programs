import java.util.*;


public class SmallestNumber {
	public static void main(String args[]) {
		System.out.println("enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the values: ");
		//int a[]=new int[n];
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//secondMinManualSort(a);
		//secondMinArraySort(a);
		secondMinCollectionSort(a);
	}
	public static void secondMinManualSort(int a[]) {
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
		System.out.print(a[1]);
	}
	public static void secondMinArraySort(int a[]) {
		Arrays.sort(a);
		System.out.print(a[1]);
	}
	public static void secondMinCollectionSort(Integer a[]) {
		
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		System.out.print(list.get(1));
		
	}

}
