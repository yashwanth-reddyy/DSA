class Solution {
    public void nextPermutation(int[] nums) {
      int idx=nums.length-2;
      boolean b = true;
      while(idx>-1){
           if(nums[idx]<nums[idx+1]){
              b=false;
              int index=-1;
              for(int i=idx+1;i<nums.length;i++){
                    if(nums[idx]<nums[i]){
                        index=i;
                    }
              }
              int temp =nums[idx];
              nums[idx]=nums[index];
              nums[index]=temp;
              int k =idx+1;
              int l=nums.length-1;
              while(l>k){
              int temp1 =nums[l];
              nums[l]=nums[k];
              nums[k]=temp1;
              k++;
              l--;
              }
              return;
           }
           idx--;
      }
      if(b){
        int i =0;
        int j =nums.length-1;
        while(j>i){
              int temp =nums[j];
              nums[j]=nums[i];
              nums[i]=temp;
              i++;
              j--;
              }

      }
    
    }
}