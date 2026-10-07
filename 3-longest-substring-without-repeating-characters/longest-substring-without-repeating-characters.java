class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int ans=0;
        HashMap<Character,Integer> y = new HashMap<>();
        for(int j =0;j<s.length();j++){
            if(y.getOrDefault(s.charAt(j),-1)!=-1){
                i=Math.max(y.get(s.charAt(j))+1,i);
            }
            y.put(s.charAt(j),j);
            int length=j-i+1;
            if(length>ans){
                ans=length;
            }
        }
        return ans;
        
    }
}