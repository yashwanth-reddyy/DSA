class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        HashSet<Integer> x =new HashSet<>();
        for(int i =0;i<nums.length;i++){
            x.add(nums[i]);
        }
        int length=1;
        for(int i :x){
            if(!x.contains(i-1)){
                int max=1;
                int num=i;
                while(x.contains(num+1)){
                    num++;
                    max++;
                }
                if(max>length){
                    length=max;
                }
            }
        }
        return length;
    }
}