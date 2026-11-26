class Solution {
    public boolean canAliceWin(int n) {
        int stone = 10;
        int total = 0;
        while(stone<=n) {
            n -= stone;
            stone--;
            total++;
        }
        return total%2==1;
    }
}