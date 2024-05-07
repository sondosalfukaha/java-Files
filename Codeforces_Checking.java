import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_Checking {

	public static void main(String[] args) {
		//Codeforces Checking
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList arr = new ArrayList(Arrays.asList('c','o','d','e','f','r','s'));
		
		for(int i=0;i<n;i++) {
			char a = input.next().charAt(0);
			if(arr.contains(a)) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			
		}
	}

}
