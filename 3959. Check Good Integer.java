class Solution {
    public boolean checkGoodInteger(int n) {
        int square = 0;
        int digit = 0;
        while(n!=0) {
            square += (n%10)*(n%10);
            digit += n%10;
            n/=10;
        }
        return square-digit>=50;
    }
}