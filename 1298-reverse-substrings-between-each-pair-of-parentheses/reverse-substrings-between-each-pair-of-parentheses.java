class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s1= new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==')'){
                int count=0;
                while(s1.peek()!='('){
                    count++;
                    sb.append(s1.pop());
                }
                 System.out.println(sb);
                s1.pop();
                for(int j =0;j<count;j++){
                     s1.push(sb.charAt(0));
                     sb.deleteCharAt(0);
                }
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!s1.isEmpty()){
            ans.append(s1.pop());
        }
        return ans.reverse().toString();
    }
}