class Solution {
    int sum =0;
    int l[]= new int [26];
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        for(int i=0;i<letters.length;i++){
            l[letters[i]-'a']++;
        }
        int l1[]=l.clone();
        int i =0;
        int sum1=0;
        helper(words,letters,score,l1,i,sum1);
        return sum;
    }
    public void helper(String[] words,char[] letters,int[] score,int[]l1,int i,int sum1){
        if(i>=words.length){
            if(sum1>sum){
                sum=sum1;
            }
            return;
        }
                  if(isValid(words[i],score,l1,sum1)){
                int x=0;
                for(int k =0;k<words[i].length();k++){
                    x+=score[words[i].charAt(k)-'a'];
                }
                helper(words,letters,score,l1,i+1,sum1+x);
                for(int k =0;k<words[i].length();k++){
                   l1[words[i].charAt(k)-'a']++;
                }
            }
           
                helper(words,letters,score,l1,i+1,sum1);
    }
    public boolean isValid(String word,int score[],int l1[],int sum1){
        int a[]=new int[26];
        for(int i =0;i<word.length();i++){
            a[word.charAt(i)-'a']++;
        }
        for(int i =0;i<26;i++){
            if(a[i]>l1[i]){
                return false;
            }
        }
        for(int i =0;i<26;i++){
            l1[i]=l1[i]-a[i];
        }
        return true;
    }
}