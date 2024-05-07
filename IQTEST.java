import java.util.Scanner;

public class IQTEST {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int task_num = input.nextInt();
		int persons_IQ = input.nextInt();
		int x=0;
		int solve=0;
		for(int i=0;i<task_num;i++) {
			x=input.nextInt();
			if(persons_IQ >= x) {
				persons_IQ = persons_IQ + x;
				solve++;
			}
		}
		System.out.println(solve);
		
	}

}
