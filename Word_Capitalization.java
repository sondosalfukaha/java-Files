import java.util.Scanner;

public class Word_Capitalization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char s = str.charAt(0);
		String ss = String.valueOf(s);
		String A = ss.toUpperCase();
		String new_str = str.replaceFirst(ss,A);
		System.out.println(new_str);
		
		
		
		

	}

}
