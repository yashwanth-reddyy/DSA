class Solution {
    public boolean isBipartite(int[][] graph) {
         int arr[]=new int[graph.length];
         Arrays.fill(arr,-1);
            for(int j=0;j<arr.length;j++){
            if(arr[j]==-1){
                boolean t=dfs(graph,j,arr,0);
                if(!t){
                    return false;
                }
                }
         }
         return true;
    }
    public boolean dfs(int [][]graph,int i,int arr[],int col){
        arr[i]=col;
        boolean b=true;
       for(int j =0;j<graph[i].length;j++){
           if(arr[graph[i][j]]==arr[i]){
            return false;
           }
           else if(arr[graph[i][j]]==-1){
             b =dfs(graph,graph[i][j],arr,col==1?0:1);
             if(!b){
                return false;
             }
           }
       }
       return b;
    }
}