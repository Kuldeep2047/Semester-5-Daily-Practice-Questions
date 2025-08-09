// Last updated: 8/9/2025, 1:44:37 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        for(int i = right-1;i>=left;i--){
            right = right&i;
            i = right;
        }
        return right;
    }
}