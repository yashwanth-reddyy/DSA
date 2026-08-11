class Solution {
    public int maxChunksToSorted(int[] arr) {
      int i =0;
      int ans=0;
      HashSet<Integer> t = new HashSet<>();
      for(int j =0;j<arr.length;j++){
        if(arr[j]==i){
            t.add(arr[j]);
             for(int w=0;w<=j;w++){
                if(!t.contains(w)){
                    i=w;
                    break;
                }
             }
             if(i==arr[j]){
                ans++;
                i=j+1;
             }
        }
        else{
             t.add(arr[j]);
        }

      }
      return ans;
       
    }
}