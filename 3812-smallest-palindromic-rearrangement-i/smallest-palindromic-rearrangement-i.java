class Solution {
    public String smallestPalindrome(String s) {
        int a[]=new int[26];
        for(int i =0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        char w[]=new char[s.length()];
        int y =0;
        int l =w.length-1;
        for(int i =0;i<a.length;i++){
            char letter = (char) (i + 'a');
            while(a[i]>=2){
                w[y]=letter;
                w[l]=letter;
                a[i]-=2;
                y++;
                l--;
            }
            if(a[i]==1){
                w[s.length()/2]=letter;
            }
        }
        
        return new String(w);
    }
}