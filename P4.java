import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
 		int A = input.nextInt();
 		int B = input.nextInt();
		int [] arr_main = {1, 2, 4};
		int [] arrA = new int[3];
		int [] arrB = new int[3];
		if(A!=B) {
		switch(A) {
		case 0 : arrA[0]=0;break;
		case 1 : arrA[0]=arr_main[0];break;
		case 2 : arrA[0]=arr_main[1];break;
		case 4 : arrA[0]=arr_main[2];break;
		case 3 : arrA[0]=arr_main[0];arrA[1]=arr_main[1];break;
		case 5 : arrA[0]=arr_main[0];arrA[1]=arr_main[2];break;
		case 6 : arrA[0]=arr_main[2];arrA[1]=arr_main[1];break;
		case 7 : arrA[0]=arr_main[0];arrA[1]=arr_main[1];arrA[2]=arr_main[2];break;
		default : System.out.println();
		}
		switch(B) {
		case 0 : arrB[0]=0;break;
		case 1 : arrB[0]=arr_main[0];break;
		case 2 : arrB[0]=arr_main[1];break;
		case 4 : arrB[0]=arr_main[2];break;
		case 3 : arrB[0]=arr_main[0];arrB[1]=arr_main[1];break;
		case 5 : arrB[0]=arr_main[0];arrB[1]=arr_main[2];break;
		case 6 : arrB[0]=arr_main[2];arrB[1]=arr_main[1];break;
		case 7 : arrB[0]=arr_main[0];arrB[1]=arr_main[1];arrB[2]=arr_main[2];break;
		default : System.out.println();

		}
		
 		 
		int sumsim=0;
		int sumdifA=0;
		int sumdifB=0;
		
		for(int i=0;i<arrA.length;i++) {
			for(int j=0;j<arrB.length;j++) {
				if(arrA[i]==arrB[j]) {
					sumsim+=arrA[i];
				}}
			if(arrA[i]!=sumsim) {
				sumdifA+=arrA[i];
			}
 		}
		for(int j=0;j<arrB.length;j++) {
			if(arrB[j]!=sumsim) {
				sumdifB+=arrB[j];
			}
		}
		
		int sum = sumsim + sumdifA + sumdifB ;
 		System.out.println(sum);
		
		}
		if(A==B) {
			System.out.println(A);
		}

}}
