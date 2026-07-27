class Solution {
    public int maxProduct(int[] nums) {
        int min1=Integer.MIN_VALUE;
        int index=-1;
        int min2=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>min1){
                index=i;
                min1=nums[i];
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]>min2&&index!=i){
                min2=nums[i];
            }
        }
        return (min1-1)*(min2-1);
    }
}