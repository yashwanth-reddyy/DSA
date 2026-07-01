class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int count =0;
       int arr[]=new int[k];
      arr[0]++;
      int sum =0;
      for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        int rem =sum%k;
        if(sum%k<0){
            rem=k+sum%k;
        }
        if(arr[rem]>0){
            count+=arr[rem];
        } 
        arr[rem]++;
       
      }
      return count;
        
    }
}