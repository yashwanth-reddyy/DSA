class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>List=new ArrayList<>();
        int n=matrix.length;
        int m =matrix[0].length;
        int i=0;
        int j =m-1;
        int d=1;
        int f=n-1;
        int x=m-1;
        int z=m-2;
        int v=0;
        int g =n-1;
        int h=1;
        int p=n-2;
        int u =0;
        while(List.size()<n*m){
            if(List.size()<n*m){
                for(int k =i;k<=j;k++){
                    List.add(matrix[i][k]);
                }
            }
            if(List.size()<n*m){
                for(int k =d;k<=f;k++){
                    List.add(matrix[k][x]);
                }
            }
             if(List.size()<n*m){
                for(int k =z;k>=v;k--){
                    List.add(matrix[g][k]);
                }
            }
            if(List.size()<n*m){
                for(int k =p;k>=h;k--){
                    List.add(matrix[k][u]);
                }
            }
            i++;
            j--;
            d++;
            f--;
            x--;
            z--;
            v++;
            g--;
            h++;
            p--;
            u++;
            }
        return List;
    }
}