import java.util.Scanner;

public class Beautiful_Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int element[][]=new int[5][5];
		int a=0,b=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				element[i][j]=input.nextInt();
				if(element[i][j]==1) {
					a=i;
					b=j;
				}
			}
			
		}
		System.out.println(Math.abs((b-2))+Math.abs((a-2)));

	}

}
