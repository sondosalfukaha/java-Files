import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String A = input.next();
		char [] arr = A.toCharArray();
		
		if(arr[0]==arr[1] && arr[0]==arr[2]) {
			System.out.println("Won");
		}
		else {
			System.out.println("Lost");
		}
	}

}
