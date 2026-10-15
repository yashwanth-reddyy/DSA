class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> t = new ArrayList<>();
        for(int i =0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                t.add(i);
            }
        }
        int ans[]=new int[boxes.length()];
        for(int j =0;j<boxes.length();j++){
            int sum =0;
            for(int q=0;q<t.size();q++){
                if(j!=t.get(q)){
                    sum+=Math.abs(t.get(q)-j);
                }
            }
            ans[j]=sum;
        }
        return ans;
    }
}