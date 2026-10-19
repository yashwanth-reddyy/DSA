class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int count1=0;
        List<Integer>t= new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]<target){
                count++;
            }
            else if(nums[i]==target){
                count1++;
            }
        }
        while(count1>0){
            t.add(count);
            count++;
            count1--;
        }
        return t;
        
    }
}