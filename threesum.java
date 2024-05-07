
public class threesum {

	public static void main(String[] args) {
		int count=0;
		int arr[]={1,2,3,4,5,6,7};
		for(int i=0;i<(arr.length)-3;i++){
			for(int j=0;j<arr.length;j++){
				if((arr[j]+arr[j+1]+arr[j+2])>2){
					count++;
				}
			}
			System.out.println(count);
		

	}

}
	}
