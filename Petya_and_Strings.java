import java.util.Scanner;

public class Petya_and_Strings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		A = A.toUpperCase();
		B = B.toUpperCase();
		int C = A.compareTo(B);
		if(C == 0) {
			System.out.println(C);
		}
		else if(C<0) {
			System.out.println(-1);
		}
		else if(C>0) {
			System.out.println(1);
		}
		

	}

}
