
public class ShuffleArray {

	public static void main(String[] args) {
				/*int [] nums = {1,2,3,4,5,6};
				int n=nums.length/2;//3
				System.out.print("[");
				String b [] = null;
				for(int i=0;i<(nums.length/2);i++) {
					System.out.print(","+nums[i]+","+nums[i+n]+",");
				}
				System.out.print("]");
				*/
		int nums[]= {2,5,1,3,4,7};
		int b=1;
		int n=nums.length/2;
		int arr[]=new int[nums.length];
		arr[0]=nums[0];
	// 2 * * * * * *
		arr[arr.length-1]=nums[nums.length-1];
   //  2 * * * * * 7
		for(int i=1;i<=nums.length-2;i++){
  // 
			if(i%2!=0){
				arr[i]=nums[n];
				n++;
			}
			else { 
				arr[i]=nums[b];
				b++; 
			}
		}

		        

		for (int i:arr) {
			System.out.print(i+",");
		}
	}}