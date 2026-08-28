class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> y = new LinkedList<>();
        boolean b[]=new boolean[rooms.size()];
        for(int i =0;i<rooms.get(0).size();i++){
            y.add(rooms.get(0).get(i));
        }
        b[0]=true;
        while(!y.isEmpty()){
                int r=y.poll();
                for(int j =0;j<rooms.get(r).size();j++){
                    if(!b[rooms.get(r).get(j)]){
                        y.add(rooms.get(r).get(j));
                    }
                }
                b[r]=true;
            }
        for(int i =0;i<b.length;i++){
            if(!b[i]){
                return false;
            }
        }
        return true;
    }
}