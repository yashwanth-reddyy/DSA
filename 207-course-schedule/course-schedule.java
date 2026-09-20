class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> t= new ArrayList<>();
        for(int i =0;i<numCourses;i++){
            t.add(new ArrayList<>());
        }
        int indeg[]=new int[numCourses];
        for(int i =0;i<prerequisites.length;i++){
            int e=prerequisites[i][0];
            int y=prerequisites[i][1];
            t.get(e).add(y);
            indeg[y]++;
        }
        Queue<Integer> r= new LinkedList<>();
        for(int i =0;i<indeg.length;i++){
            if(indeg[i]==0){
                r.add(i);
            }
        }
        int count=0;
        while(!r.isEmpty()){
            int w=r.poll();
            count++;
            for(int j =0;j<t.get(w).size();j++){
                indeg[t.get(w).get(j)]--;
                if(indeg[t.get(w).get(j)]==0){
                    r.add(t.get(w).get(j));
                }
            }
        }
        return count==numCourses;
    }
}