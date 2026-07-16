class Solution {
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> y = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int gcd=helper(nums[i],max);
            y.add(gcd);
        }
        int k =0;
        int l =y.size()-1;
        long ans1=0;
        Collections.sort(y);
        while(k<l){
            ans1+=helper(y.get(k),y.get(l));
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