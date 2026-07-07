class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[]=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            ans[j]=arr[j];
        }
        Arrays.sort(arr);
        int k =1;
        HashMap<Integer,Integer> y = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(!y.containsKey(arr[i])){
            y.put(arr[i],k);
            k++;
            }
        }
        for(int j =0;j<arr.length;j++){
            ans[j]=y.get(ans[j]);
        }
        return ans;
    }
}