import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String st=input.next();
		char array [] = st.toCharArray();
		
		
		int j1=0;
		if(array[0]=='R' && array[1]=='R' && array[2]=='R') {
			j1=3;
			}
		if(array[0]=='R' && array[1]!='R' && array[2]=='R') {
			j1=1;
			}
		if(array[0]!='R' && array[1]=='R' && array[2]=='R') {
			j1=2;
		}
		if(array[0]=='R' && array[1]=='R' && array[2]!='R') {
			j1=2;
		}
		if(array[0]!='R' && array[1]=='R' && array[2]!='R') {
			j1=1;
			}
		if(array[0]=='R' && array[1]!='R' && array[2]!='R') {
			j1=1;
			}
		if(array[0]!='R' && array[1]!='R' && array[2]=='R') {
			j1=1;
			}
		
		System.out.println(j1);
	}

}
