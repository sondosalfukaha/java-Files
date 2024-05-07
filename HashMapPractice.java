import java.util.HashMap;

class HashMapPractice {
    public static void main(int[] nums) {
    	 // array > nums
        // [1,2,2,3,1,4]
        // [2,2,  1,  ,1]
        HashMap <Integer,Integer> mp = new HashMap <Integer,Integer> ();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],0);
        }
        // [0,0,  0,   0]
        for(int i=0;i<nums.length;i++){
            Integer value = mp.get(nums[i])+1;
            mp.put(nums[i],value);
        }
        // [2,2,  1,  ,1]
        Integer max = Integer.MIN_VALUE;
        for(Integer key: mp.keySet()) {
            if(mp.get(key)>max){
                max = mp.get(key);
            }
        }
        int count = 0;
        for(Integer key: mp.keySet()) {
           if(mp.get(key) == max) {
               count +=max;
           }
        }


    }
}


