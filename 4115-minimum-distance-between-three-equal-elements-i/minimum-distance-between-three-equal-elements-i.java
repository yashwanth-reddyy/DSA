class Solution {
    public int minimumDistance(int[] nums) {
       List<List<Integer>> x= new ArrayList<>();
       for(int i =0;i<=nums.length;i++){
        x.add(new ArrayList<>());
       }
       for(int i =0;i<nums.length;i++){
            x.get(nums[i]).add(i);
       }
     
       int a=Integer.MAX_VALUE;
      for(int i =0;i<x.size();i++){
        if(x.get(i).size()>=3){
            for(int g =0;g<x.get(i).size()-2;g++){
            int z=Math.abs(x.get(i).get(g)-x.get(i).get(g+1))+Math.abs(x.get(i).get(g+1)-x.get(i).get(g+2))+Math.abs(x.get(i).get(g+2)-x.get(i).get(g));
            if(a>z){
                a=z;
            }
            }
        }
      }
      return a==Integer.MAX_VALUE?-1:a;
        }
}