class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int sum =0;
       if(nums.length%2==0){
           int x=nums[nums.length/2]+nums[(nums.length/2)-1];
           sum=x/2;
       }
       else{
        sum=nums[nums.length/2];
       }
        int ans=0;
        for(int  r=0;r<nums.length;r++){
            ans+=(int)Math.abs(nums[r]-sum);
        }
        return ans;
    }
}