class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int count =0;
      HashMap<Integer,Integer> y = new HashMap<>();
      y.put(0,1);
      int sum =0;
      for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        if(y.containsKey(sum%k)){
            count+=y.get(sum%k);
        } 
        if(y.containsKey(((sum%k)-k))){
            count+=y.get(((sum%k)-k));
        } 
        if(y.containsKey(((sum%k)+k))){
            count+=y.get(((sum%k)+k));
        }
        y.put(sum%k,y.getOrDefault(sum%k,0)+1);
      }
      return count;
        
    }
}