class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer>x = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(x.containsKey(target-nums[i])){
                arr[0]=x.get(target-nums[i]);
                arr[1]=i;
            }
            x.put(nums[i],i);
        }
        return arr;
    }
}