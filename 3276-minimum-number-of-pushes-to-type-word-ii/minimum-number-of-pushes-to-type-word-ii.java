class Solution {
    public int minimumPushes(String word) {
        int ans[]=new int[26];
        for(int i =0;i<word.length();i++){
            ans[word.charAt(i)-'a']++;
        }
        Arrays.sort(ans);
        int k =1;
        int count=1;
        int ans1=0;
        for(int j =25;j>=0;j--){
            if(ans[j]>0){
                ans1+=ans[j]*k;
                count++;
                if(count%9==0){
                    k++;
                    count=1;
                }
            }
        }
        return ans1;
    }
}