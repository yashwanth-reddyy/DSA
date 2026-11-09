class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> t = new ArrayList<>();
        for(int i =0;i<=edges.length;i++){
            t.add(new ArrayList<>());
        }
        for(int i =0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            t.get(x).add(y);
            t.get(y).add(x);
        }
        
        for(int i =edges.length-1;i>=0;i--){
            int x=edges[i][0];
            int y=edges[i][1];
            int vis[]=new int[edges.length+1];
            int par[]=new int[edges.length+1];
             boolean hascycle=false;
            for(int j =1;j<edges.length+1;j++){
              if(vis[j]!=1){
                par[j]=-1;
                boolean b =dfs(edges,j,t,vis,x,y,par);
                if(!b){
                hascycle=true;
                   break;
                }
              }
            }
            if(!hascycle){
                return edges[i];
            }
        }
        return new int[]{};     
    }
    public boolean dfs(int edges[][],int j,List<List<Integer>> t,int vis[],int x,int y, int par[]){
        vis[j]=1;
        for(int  k =0;k<t.get(j).size();k++){
            if(j==x&&t.get(j).get(k)==y){
                continue;
            }
            if(j==y&&t.get(j).get(k)==x){
                continue;
            }
            if(vis[t.get(j).get(k)]==1&&par[j]!=t.get(j).get(k)){
                return false;
            }
            if(vis[t.get(j).get(k)]==1&&par[j]==t.get(j).get(k)){
                continue;
            }
            par[t.get(j).get(k)]=j;
            boolean b= dfs(edges,t.get(j).get(k),t,vis,x,y,par);
            if(!b){
                return false;
            }
        }
        return true;
    }
}