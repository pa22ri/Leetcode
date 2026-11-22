class Solution {
    public boolean checkString(String s) {
        boolean flag  = true;
        if(s.contains("ba")) {
            flag = false;
        }
        return flag;
    }
}