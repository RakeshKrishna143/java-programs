import java.util.*;

public class FindDuplicateChar {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		FindDuplicateChar(s);
	}
	public static void FindDuplicateChar(String s){
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=s.toCharArray();
		for (char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		Set< Character> keys = map.keySet();
		for( char c:keys) {
			if(map.get(c)>1) {
				System.out.println(c+""+map.get(c));
			}
		}
		
		
	}

}
