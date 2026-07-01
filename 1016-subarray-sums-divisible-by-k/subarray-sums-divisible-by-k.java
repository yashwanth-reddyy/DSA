class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int count =0;
      HashMap<Integer,Integer> y = new HashMap<>();
      y.put(0,1);
      int sum =0;
      for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        int rem =sum%k;
        if(sum%k<0){
            rem=k+sum%k;
        }
        if(y.containsKey(rem)){
            count+=y.get(rem);
        } 
         y.put(rem,y.getOrDefault(rem,0)+1);

       
      }
      return count;
        
    }
}