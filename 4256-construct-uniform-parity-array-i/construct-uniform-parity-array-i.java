class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1.length==1){
            return true;
        }
        int count=0;
        int count1=0;
        for(int i =0;i<nums1.length;i++){
            if(nums1[i]%2==0){
               count++;
            }
            else{
                count1++;
            }
        }
       if(count==nums1.length||count1==nums1.length){
        return true;
       }
       if(count>0){
        return true;
       }
       return false;

    }
}