import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String w = input.next();
		if(w.equals("Sunny")) {
			System.out.println("Cloudy");
		}
		if(w.equals("Cloudy")) {
			System.out.println("Rainy");
		}
		if(w.equals("Rainy")) {
			System.out.println("Sunny");
		}
	}

}
