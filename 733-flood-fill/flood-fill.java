class Pair{
    int i;
    int j;
    public Pair(int i ,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> t=new LinkedList<>();
        int original=image[sr][sc];
        Pair p =new Pair(sr,sc);
        t.add(p);
        while(!t.isEmpty()){
            Pair r=t.poll();
            int s=r.i;
            int g=r.j;
            image[s][g]=color;
            if((s-1>-1&&s-1<image.length)&&(image[s-1][g]!=color&&image[s-1][g]==original)){
                Pair q=new Pair(s-1,g);
                t.add(q);
            }
            if((s+1>-1&&s+1<image.length)&&(image[s+1][g]!=color&&image[s+1][g]==original)){
                Pair q=new Pair(s+1,g);
                t.add(q);
            }
            if((g+1>-1&&g+1<image[0].length)&&(image[s][g+1]!=color&&image[s][g+1]==original)){
                Pair q=new Pair(s,g+1);
                t.add(q);
            }
            if((g-1>-1&&g-1<image[0].length)&&image[s][g-1]!=color&&image[s][g-1]==original){
                Pair q=new Pair(s,g-1);
                t.add(q);
            }
        }
        return image;
    }
}