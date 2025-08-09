// Last updated: 8/9/2025, 1:36:29 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(x-z);
        int b = Math.abs(y-z);
        if(a<b){
            return 1;
        }else if(b<a){
            return 2;
        }else{
            return 0;
        }
    }
}