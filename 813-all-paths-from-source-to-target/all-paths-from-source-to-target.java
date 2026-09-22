class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>> t= new ArrayList<>();
      ArrayList<Integer>r= new ArrayList<>();
      dfs(t,graph,0,graph.length-1,r);
      return t;
    }
    public void dfs(List<List<Integer>> t,int graphs[][],int i, int target,ArrayList<Integer> r){
        if(i==target){
            ArrayList<Integer> w= new ArrayList<>(r);
            w.add(target);
            t.add(w);
            return;
        }
        r.add(i);
        for(int j =0;j<graphs[i].length;j++){
           dfs(t,graphs,graphs[i][j],target,r);
        }
        r.remove(r.size()-1);
    }
}