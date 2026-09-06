class Solution {
    public boolean isBipartite(int[][] graph) {
          int color[]=new int[graph.length];
          Arrays.fill(color,-1);
          for(int i =0;i<graph.length;i++){
            if(color[i]!=-1){
                continue;
            }
            color[i]=0;
            Queue<Integer> t = new LinkedList<>();
            t.add(i);
            while(!t.isEmpty()){
                int index=t.poll();
                for(int j =0;j<graph[index].length;j++){
                    if(color[graph[index][j]]==-1){
                        color[graph[index][j]]=1-color[index];
                        t.add(graph[index][j]);
                    }
                    else if(color[graph[index][j]]==color[index]){
                        return false;
                    }
                }
            }
          }
          return true;
    }
}