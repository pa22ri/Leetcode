class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++) {
            StringBuilder str = new StringBuilder();
            int num = n;
            while(num>0) {
                str.append(num%i);
                num = num / i;
            }
            String s = str.reverse().toString();
            int left = 0;
            int right = s.length()-1;
            while(left<right) {
                if(s.charAt(left)!=s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}