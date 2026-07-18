class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return helper(min,max);
    }
    public int helper(int a,int b){
        if(b==0){
            return a;
        }
        return helper(b,a%b);
    }
}