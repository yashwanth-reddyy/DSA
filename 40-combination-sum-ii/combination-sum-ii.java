class Solution {
    List<List<Integer>> t =new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     int sum =0;
     List<Integer> y = new ArrayList<>();
     int i =0;
     Arrays.sort(candidates);
     helper(candidates,target,sum,y,i);
     return t;
    }
    public void helper(int[] candidates,int target,int sum,List<Integer>y,int i){
      
        if(sum>target){
            return;
        }
        if(sum==target){
            t.add(new ArrayList<>(y));
        }
         if(i>=candidates.length){
            return;
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i&&(candidates[j]==candidates[j-1])){
               continue;
            }
            y.add(candidates[j]);
            helper(candidates,target,sum+candidates[j],y,j+1);
            y.remove(y.size()-1);
        }
    }
}