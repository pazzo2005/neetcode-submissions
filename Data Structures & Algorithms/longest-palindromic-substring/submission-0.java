class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int global_len = 0;
        int start = 0;
        for (int i = 0; i < s.length(); ++i) {
            int a = expand(s, i, i);
            int b = expand(s, i, i + 1);
            int currentLen = Math.max(a, b);
            if (currentLen > global_len) {
                global_len=currentLen;
                start = i - (currentLen - 1) / 2;
            }
        }
        return s.substring(start,start+global_len);
    }
    public int expand(String nums, int left, int right) {
        while (left >= 0 && right >= 0 && left < nums.length() && right < nums.length()
            && nums.charAt(left) == nums.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
