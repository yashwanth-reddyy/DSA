class Solution {
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int gcd=helper(nums[i],max);
            prefix[i]=gcd;
        }
        int k =0;
        int l =prefix.length-1;
        long ans1=0;
        Arrays.sort(prefix);
        while(k<l){
            ans1+=helper(prefix[k],prefix[l]);
            k++;
            l--;
        }
        return  ans1;
    }
    public int helper(int num,int max){
        if(max==0){
            return num;
        }
        return helper(max,num%max);
    }
}