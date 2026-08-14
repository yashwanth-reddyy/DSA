class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
      int m[]=new int[garbage.length];
      int p[]=new int[garbage.length];
      int g[]=new int[garbage.length];
      int prefix[]=new int[travel.length+1];
      for(int i =1;i<=travel.length;i++){
        prefix[i]=prefix[i-1]+travel[i-1];
      }
      for(int i =0;i<garbage.length;i++){
        StringBuilder sb = new StringBuilder(garbage[i]);
        int j =0;
        while(j<sb.length()){
            char a=sb.charAt(j);
            if(a=='G'){
                g[i]++;
            }
            else if(a=='P'){
                p[i]++;
            }
            else{
                m[i]++;
            }
            j++;
        }
      }
      int ans=0;
     int start =-1;
     for(int i =0;i<garbage.length;i++){
        if(g[i]>0&&start==-1){
            ans=ans+(prefix[i])+g[i];
            start=i;
        }
        else if(g[i]>0&&start!=-1){
            ans=ans+(prefix[i]-prefix[start])+g[i];
            start=i;
        }
     }
      int start1 =-1;
     for(int i =0;i<garbage.length;i++){
        if(p[i]>0&&start1==-1){
            ans=ans+(prefix[i])+p[i];
            start1=i;
        }
        else if(p[i]>0&&start1!=-1){
            ans=ans+(prefix[i]-prefix[start1])+p[i];
            start1=i;
        }
     }
     int start2 =-1;
     for(int i =0;i<garbage.length;i++){
        if(m[i]>0&&start2==-1){
            ans=ans+(prefix[i])+m[i];
            start2=i;
        }
        else if(m[i]>0&&start2!=-1){
            ans=ans+(prefix[i]-prefix[start2])+m[i];
            start2=i;
        }
     }
     return ans;
    }
}