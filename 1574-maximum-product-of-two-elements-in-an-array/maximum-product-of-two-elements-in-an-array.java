class Solution {
    public int maxProduct(int[] nums) {
        int min1=Integer.MIN_VALUE;
        int min2=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]>min2){
                min2=nums[i];
            }
        }
        return (min1-1)*(min2-1);
    }
}