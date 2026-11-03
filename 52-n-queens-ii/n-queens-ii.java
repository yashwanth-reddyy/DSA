class Solution {
    
    public int totalNQueens(int n) {
        if(n==1){
            return 1;
        }
        String ans[][]=new String[n][n];
         for(int j =0;j<ans.length;j++){
            for(int k =0;k<ans.length;k++){
                ans[j][k]=".";
            }
        }

        int i =0;
        return reddy(ans,i);
    }
    static int reddy(String ans[][],int i){
        if(i==ans.length){

            return 1;
        }
        int count=0;
        for(int j =0;j<ans.length;j++){
                if(valid(ans, i, j)){
                 ans[i][j]="Q";
                count+= reddy(ans, i+1);
                ans[i][j]=".";
                }
            }
            return count;
    }
    static boolean valid(String ans[][],int i ,int j){
        int y=i-1;
        while(y>=0){
            if(ans[y][j].equals("Q")){
                return false;
            }
            y--;
        }
        int h =i-1;
        int s=j-1;
        while(h>=0&&s>=0){
            if(ans[h][s].equals("Q")){
                return false;
            }
            h--;
            s--;
        }
        int q =i-1;
        int a=j+1;
        while(q>=0&&a<ans.length){
            if(ans[q][a].equals("Q")){
                return false;
            }
            q--;
            a++;
        }
        return true;
    }

    }