class Solution {
    List<List<Integer>> y = new ArrayList<>();
    HashSet<List<Integer>> u = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> t = new ArrayList<>();
        int a=0;
        int size=nums.length;
        helper(a,nums,size,t);
        return y;
    }
    public void helper(int a, int nums[], int size, ArrayList<Integer> t){
           if(a>=size){
           ArrayList<Integer> x= new ArrayList<>(t);
           Collections.sort(x);
           if(!u.contains(x)){
            y.add(new ArrayList<>(t));
            u.add(x);
           }
            return;
           }
           t.add(nums[a]);
           helper(a+1,nums,size,t);
           t.remove(t.size()-1);
           helper(a+1,nums,size,t);
    
    }
    
}