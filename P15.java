import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int S = input.nextInt();
		int W = input.nextInt();
		
		if(W>=S) {
			System.out.println("unsafe");
		}
		else {
			System.out.println("safe");
		}

	}

}
