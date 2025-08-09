// Last updated: 8/9/2025, 1:39:29 PM
class Solution {
    public int sumBase(int n, int k) {
        int num = num_in_k(n,k);
        int ans = 0;
        while(num>0){
            ans += num%10;
            num = num/10;
        }
        return ans;
    }
    public static int num_in_k(int n,int k){
        int sum=0;
        int mul =1;
        while (n > 0) {
			int rem = n % k;
			sum = sum + rem * mul;
			n = n / k;
			mul = mul * 10;
	    }
        return sum;
    }
}