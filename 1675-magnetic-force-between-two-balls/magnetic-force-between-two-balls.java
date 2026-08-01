class Solution {
    public int maxDistance(int[] position, int m) {
        int ans=Integer.MIN_VALUE;
        Arrays.sort(position);
        int start =0;
        int end =position[position.length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(position,m,mid)){
                start=mid+1;
                ans=Math.max(ans,mid);
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int position[],int m ,int mid){
        int count=1;
        int i =position[0];
        for(int j =1;j<position.length;j++){
            if(position[j]-i>=mid){
                i=position[j];
                count++;
                if(count>=m){
            return true;
        }
            }
        }
        if(count>=m){
            return true;
        }
        return false;

    
    }
}