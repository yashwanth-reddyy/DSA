class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
      int ans=0;
      int lastG=-1;
      int lastP=-1;
      int lastM=-1;
      for(int i =0;i<garbage.length;i++){
        ans+=garbage[i].length();
        if(garbage[i].indexOf('G') != -1) lastG = i;
            if (garbage[i].indexOf('P') != -1) lastP = i;
            if (garbage[i].indexOf('M') != -1) lastM = i;
        }
      int current=0;
      for(int i =0;i<travel.length;i++){
        current+=travel[i];
        if(lastG==(i+1)){
            ans+=current;
        }
        if(lastP==(i+1)){
            ans+=current;
        }
        if(lastM==(i+1)){
            ans+=current;
        }
      }
      return ans;
    }
}