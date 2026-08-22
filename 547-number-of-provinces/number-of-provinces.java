class Solution {
    boolean b[];
    public int findCircleNum(int[][] isConnected) {
     b=new boolean[isConnected.length];
     int count=0;
     Queue<Integer> t = new LinkedList<>();
     for(int i =0;i<isConnected.length;i++){
        if(!b[i]){
            count++;
            b[i]=true;
            t.add(i);
            while(!t.isEmpty()){
                int r=t.poll();
                for(int j =0;j<isConnected.length;j++){
                    if(isConnected[r][j]==1&&b[j]==false){
                        b[j]=true;
                        t.add(j);
                    }
                }
            }
        }
     }
     return count;
    }
}