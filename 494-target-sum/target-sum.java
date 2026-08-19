class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum =0;
        int i =0;
        helper(nums,target,sum,i);
        return ans;
    }
    public void helper(int nums[],int target,int sum,int i){
        if(i>nums.length){
            return;
        }
         if(i==nums.length){
            if(sum==target){
                ans++;
            }
            return;
         }
         helper(nums,target,sum+nums[i],i+1);
         helper(nums,target,sum-nums[i],i+1);
    }
}