class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> t= new ArrayList<>();
        int a[]=new int[graph.length];
        for(int i =0;i<graph.length;i++){
            if(graph[i].length==0){
                t.add(i);
            }
            else{
            if(a[i]==0){
            int arr[]=new int[graph.length];
            boolean b=dfs(graph,arr,i,a);
            if(b){
                t.add(i);
                a[i]=2;
            }
            else if(!b){
                a[i]=1;
            }
            }
            else if(a[i]==2){
                t.add(i);
            }
            }
        }
        return t;
    }
    public boolean dfs(int graph[][],int arr[],int i,int a[]){
        if(a[i]==1){
            return false;
        }
        if(arr[i]==1){
            return false;
        }
        if(a[i]==2){
            return true;
        }
        if(graph[i].length==0){
            return true;
        }
        for(int j =0;j<graph[i].length;j++){
             arr[i]=1;
             boolean t=dfs(graph,arr,graph[i][j],a);
             if(!t){
              return false;
              }
              arr[i]=0;
        }
        a[i]=2;
        return true;
    }
}