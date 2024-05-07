import java.util.Scanner;

public class B_EvenandOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int even = (x)/2;
		int odd = (x+1)/2;		
		System.out.println(even+" "+odd);
	}

}
