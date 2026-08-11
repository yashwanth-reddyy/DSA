class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> t= new HashSet<>();
        for(int i =0;i<nums.length;i++){
            t.add(nums[i]);
        }
        int sum =nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+1)){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
       for(int i =sum;i<=Integer.MAX_VALUE;i++){
            if(!t.contains(i)){
                return i;
            }
       }
       return -1;
    }
}