// Last updated: 8/9/2025, 1:44:36 PM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n > 1){
            n = square(n);
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            if(n==1){
                return true;
            }
        }
        return true;
        
        
    }
    public static int square(int n){
        int sqr =0;
        while(n>0){
            int rem = n%10;
            sqr += (rem*rem);
            n=n/10;
        }
        return sqr;
    }
}