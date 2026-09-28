class Solution {
    public int findCircleNum(int[][] isConnected) {
       List<List<Integer>> t = new ArrayList<>();
       for(int i =0;i<isConnected.length;i++){
         t.add(new ArrayList<>());
       }
       for(int i =0;i<isConnected.length;i++){
        for(int j=0;j<isConnected[i].length;j++){
            if(i!=j&&isConnected[i][j]==1){
                t.get(i).add(j);
            }
        }
       }
       int vis[]=new int[t.size()];
       int count=0;
       for(int i =0;i<t.size();i++){
        if(vis[i]==0){
        count++;
        dfs(vis,t,i);
        }
       }
       return count;
    }
    public void dfs( int vis[],List<List<Integer>> t,int i){
     vis[i]=1;
     for(int j =0;j<t.get(i).size();j++){
        if(vis[t.get(i).get(j)]==0){
            dfs(vis,t,t.get(i).get(j));
        }
     }
    }
}