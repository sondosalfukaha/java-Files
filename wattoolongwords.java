import java.util.Scanner;

public class wattoolongwords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums = input.nextInt();
		String arr[]=new String[nums];
		String words;
		for(int i=0;i<nums;i++) {
			words = input.next();
			if(words.length()>10) {
				System.out.println((words.charAt(0)+""+(words.length()-2)+""+words.charAt(words.length()-1)));
				
			}
			else {
				System.out.println(words);
				
			}
			
		}


	}

}
