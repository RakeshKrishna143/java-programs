import java.util.*;

public class FindDuplicateElementInList {
	public static void main(String args[]) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		FindDuplicateElementInList output = new FindDuplicateElementInList(a);
		
		
	}
	FindDuplicateElementInList(int a[]){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:a) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		Set<Integer> keys=map.keySet();
		for(int i:keys) {
			if(map.get(i)>1) {
				System.out.println(i+" "+map.get(i));
			}
		}
		
		
	}

}
