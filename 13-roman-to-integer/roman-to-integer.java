class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int curr=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            curr=helper(s.charAt(i));
             if(prev>curr){
                ans-=curr;
             }
             else{
                ans+=curr;
             } 
             prev=curr;
        }
        return ans;
    }
    public int helper(char a){
        switch (a) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
    }
}