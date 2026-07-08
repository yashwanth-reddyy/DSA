class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        HashMap<Integer,Integer> y =new HashMap<>();
        for(int i =0;i<nums.length;i++){
            y.put(nums[i],1);
        }
        int length=1;
        int count=1;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int u =nums[i];
            count=1;
            y.remove(n);
            while(y.containsKey(n+1)){
                count++;
                y.remove(n+1);
                n++;
            }
            while(y.containsKey(u-1)){
                count++;
                y.remove(u-1);
                u--;
            }
            if(count>length){
                length=count;
            }
        }
        return length;
    }
}