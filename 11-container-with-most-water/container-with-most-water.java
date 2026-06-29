class Solution {
    public int maxArea(int[] height) {
        int min=Integer.MIN_VALUE;
        int i =0;
        int j =height.length-1;
        while(i<height.length-1&&j>-1&&j>i){
            int sum =(j-i)*Math.min(height[i],height[j]);
            if(sum>min){
                min=sum;
            }
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return min;
        
    }
}