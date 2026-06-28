class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp = new boolean[n][n];
        int length=0;
        int index=0;
        for(int len=1;len<=n;++len){
            for(int i=0;i+len-1<n;++i){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j) && (len<=2 || dp[i+1][j-1])){
                    dp[i][j]=true;
                    int le = j-i+1;
                    if(le>length){
                        length=le;
                        index=i;
                    }
                }
            }
        }
        return s.substring(index,length+index);
    }
}
