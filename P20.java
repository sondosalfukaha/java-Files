import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		String a = d.next();
		char [] c = new char[6];
		c=a.toCharArray();
		int g=0;
		for(int i=0;i<c.length;i++) {
		if(c[i]>=97 && c[i]<=122) {
			g++;
		}
		}
		 
		if(g==c.length) {
		if(c[2]==c[3] && c[4]==c[5]){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}}

}
