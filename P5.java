import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		if(1<=M && M<=1000 && 1<=H && H<=1000) {
			 
		if(M%H==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		}
	}

}
