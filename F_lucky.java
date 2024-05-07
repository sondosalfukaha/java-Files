import java.util.Scanner;

public class F_lucky {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nums = input.nextInt();
		
		String arr[] = new String[nums];
		
		for(int i=0;i<nums;i++) {
			String A = input.next();
			int b = A.charAt(0)+A.charAt(1)+A.charAt(2);
			int c = A.charAt(3)+A.charAt(4)+A.charAt(5);
			if(b==c) {
				arr[i]="YES";
			}
			else
				arr[i]="NO";
	System.out.println(arr[i]);		
			}
		
		/*
for(int i=0;i<nums;i++) {
			System.out.println(arr[i]);
		}
		
*/		
		
	}
}
