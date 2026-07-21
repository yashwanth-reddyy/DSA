class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> y= new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]<10){
                if(!y.contains(nums[i])){
                y.add(nums[i]);
                }
            }
            else{
                     y.add(nums[i]);
                     int z=nums[i];
                     int y1 =0;
                    int m=(int) Math.log10(z) + 1;
                     while(z!=0){
                        int h=z%10;
                        int q=(int)Math.pow(10,m-1);
                        y1+=h*q;
                        m--;
                        z/=10;
                     }
                     y.add(y1);
                    
                }
            }
        
        return y.size();
    }
}