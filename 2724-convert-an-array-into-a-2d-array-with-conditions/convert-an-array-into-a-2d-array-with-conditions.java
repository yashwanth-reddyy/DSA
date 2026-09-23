class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> t = new ArrayList<>();
        int ans[]=new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        int count=0;
        int i =0;
        boolean b=false;
        while(true){
            t.add(new ArrayList<>());
            for(int j =0;j<ans.length;j++){
               if(ans[j]>=1){
                ans[j]--;
                t.get(i).add(j);
                count++;
                if(count==nums.length){
                    b=true;
                    break;
                }
                System.out.println(t);
               }
            }
            if(b){
                break;
               }
            i++;
        }
        return t;
    }
}