import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String st=input.next();
		char []arr=st.toCharArray();
		int y=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>=97 && arr[i]<=122) {
				y++;
			}

		}
		if(y==arr.length) {
		if(arr[st.length()-1]=='s') {
			System.out.println(st+"es");
		}
		else if(arr[st.length()-1]!='s') {
			System.out.println(st+"s");
		}

	}

	}}
