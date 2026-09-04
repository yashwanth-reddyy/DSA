class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            max1=Math.max(nums[i],max1);
            max[i]=max1;
            min1=Math.min(nums[nums.length-1-i],min1);
            min [nums.length-1-i]=min1;
        }
       for(int i =0;i<nums.length;i++){
        if(max[i]-min[i]<=k){
            return i;
        }
       }
       return -1;
    }
        
}