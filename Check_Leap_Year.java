import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					System.out.print("leapyear");
				}
				else {
					System.out.print("not leapyear");
				}
				
			}
			else {
				System.out.print("leapyear");
			}
		}
		else {
			System.out.print("not leapyear");
			
		}
	}

}
