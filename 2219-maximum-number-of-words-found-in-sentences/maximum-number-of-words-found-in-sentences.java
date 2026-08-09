class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i =0;i<sentences.length;i++){
            String s[]=sentences[i].split(" "); 
            if(s.length>ans){
                ans=s.length;
            }
        }
        return ans;
    }
}