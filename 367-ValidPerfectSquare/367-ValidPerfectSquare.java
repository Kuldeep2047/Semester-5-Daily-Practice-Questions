// Last updated: 9/27/2025, 10:31:02 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        return answer(num);
    }

    public static boolean answer(int n){
        int low =1;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            long square = (long)mid*mid;

            if(square == n){
                return true;
            }else if(square<n){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}