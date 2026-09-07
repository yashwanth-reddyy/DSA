class Solution {
    List<Integer> t = new ArrayList<>();
    boolean b[];
    public List<Integer> lexicalOrder(int n) {
         b=new boolean[n+1];
         for(int i =1;i<=9;i++){
        helper(n,i);
         }
        return t;
    }
    public void helper(int n, int sum){
        if(sum>n){
            return;
        }
        if(!b[sum]){
            t.add(sum);
            b[sum]=true;
        }
        helper(n,sum*10);
         if (sum % 10 != 9) {
            helper(n, sum + 1);
        }
    }
}