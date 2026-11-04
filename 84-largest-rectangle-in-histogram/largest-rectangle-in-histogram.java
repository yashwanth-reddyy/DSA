class Solution {
    public int largestRectangleArea(int[] heights) {
        int left[]=new int[heights.length];
        left[0]=0;
        Deque<Integer> leftHeight= new ArrayDeque<>();
        leftHeight.push(0);
        for(int i =1;i<heights.length;i++){
            if(heights[i]>heights[leftHeight.peek()]){
                leftHeight.push(i);
                left[i]=0;
            }
            else{
                while(!leftHeight.isEmpty()&&heights[i]<=heights[leftHeight.peek()]){
                    leftHeight.pop();
                }if(leftHeight.isEmpty()){
                    left[i]=i;
                }
                else{
                left[i]=i-leftHeight.peek()-1;
                }
                leftHeight.push(i);
                
            }
        }
         int right[]=new int[heights.length];
        right[right.length-1]=0;
        Deque<Integer> rightHeight= new ArrayDeque<>();
        rightHeight.push(right.length-1);
        for(int i =heights.length-2;i>=0;i--){
            if(heights[i]>heights[rightHeight.peek()]){
                rightHeight.push(i);
                right[i]=0;
            }
            else{
                while(!rightHeight.isEmpty()&&heights[i]<=heights[rightHeight.peek()]){
                    rightHeight.pop();
                }
                if(rightHeight.isEmpty()){
                    right[i]=heights.length-1-i;
                }else{
                    right[i]=rightHeight.peek()-i-1;
                }
                rightHeight.push(i);
            }
        }
       int min =Integer.MIN_VALUE;
       for(int i =0;i<heights.length;i++){
        int max=heights[i]*(left[i]+right[i]+1);
        if(max>min){
            min=max      ;
              }
       }
       return min;
    }
}