import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		String ns=Integer.toString(n);
		char[]arr=ns.toCharArray();
		int wrong=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='7') {
				System.out.println("Yes");
				break;
			}
			else {wrong++;
		}}
		if(wrong==3) {
			System.out.println("No");
		}
		
	


	}

}
