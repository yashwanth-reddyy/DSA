class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> t= new ArrayList<>();
        int inDeg[]=new int[numCourses];
        for(int i =0;i<numCourses;i++){
           t.add(new ArrayList<>());
        }
        for(int j =0;j<prerequisites.length;j++){
           int e=prerequisites[j][0];
           int y=prerequisites[j][1];
           inDeg[y]++;
           t.get(e).add(y);
        }
        Queue<Integer>q= new LinkedList<>();
        for(int j =0;j<inDeg.length;j++){
            if(inDeg[j]==0){
                q.add(j);
            }
        }
        int count=0;
        Stack<Integer> d= new Stack<>();
        while(!q.isEmpty()){
            int r= q.poll();
            d.push(r);
            count++;
            for(int i =0;i<t.get(r).size();i++){
                inDeg[t.get(r).get(i)]--;
                if(inDeg[t.get(r).get(i)]==0){
                    q.add(t.get(r).get(i));
                }
            }
        }
        if(count!=numCourses){
            return new int[]{};
        }
        int arr[]=new int[numCourses];
        int j=0;
        while(!d.isEmpty()){
            arr[j++]=d.pop();
        }
        return arr;
    }
}