class Solution {
    public String smallestPalindrome(String s) {
        int a[]=new int[26];
        for(int i =0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(a));
        char w[]=new char[s.length()];
        int y =0;
        int l =w.length-1;
        for(int i =0;i<a.length;i++){
            while(a[i]>0){
                if(a[i]>=2){
                char letter = (char) (i + 'a');
                w[y]=letter;
                a[i]--;
                y++;
                w[l]=letter;
                l--;
                a[i]--;
            }
            if(a[i]==1){
                int q=s.length()/2;
                char letter = (char) (i + 'a');
                w[q]=letter;
                a[i]--;
                break;
            }
            }
        }
        
       
        
       
        StringBuilder sb = new StringBuilder();
         for(int i =0;i<w.length;i++){
            sb.append(w[i]);
         }
        return sb.toString();
    }
}