class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> y = new HashMap<>();
       y.put(0,1);
       int count=0;
       int ans=0;
       for(int i =0;i<nums.length;i++){
        count+=nums[i];
        if(y.containsKey(count-k)){
            ans+=y.get(count-k);
        }
        y.put(count,y.getOrDefault(count,0)+1);
    }
    return ans;
}
}