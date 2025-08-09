// Last updated: 8/9/2025, 1:44:41 PM
class Solution {
    public int hammingWeight(int n) {
        return One_bit(n);
    }

    public static int One_bit(int n) {
        int c = 0;
        while(n>0){
            if(n%2==1){ 
                c++;
            }
            n =n/2; 
        }
        return c;
    }
}
