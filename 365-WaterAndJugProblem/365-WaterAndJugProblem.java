// Last updated: 8/9/2025, 1:43:46 PM
class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y<target){
            return false;
        }else{
            int gcd = gcd(x,y);
            if(target%gcd==0){
                return true;
            }else{
                return false;
            }
        }
    }
    public static int gcd(int divisor,int dividend){
		while(dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
			
		}
		return divisor;
    }
}