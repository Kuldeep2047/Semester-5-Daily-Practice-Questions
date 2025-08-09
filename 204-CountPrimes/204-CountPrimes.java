// Last updated: 8/9/2025, 1:44:33 PM
class Solution {
    public int countPrimes(int n) {
        if(n<2) {
            return 0;
        }
        int[] prime = new int[n];

        for(int i=2; i*i<=n; i++) {
            if(prime[i]==0) {
                for(int j=i*i; j<n; j+=i) {
                    prime[j] = 1;
                }
            }
        }

        int count =0;
        for(int i=2; i<n; i++) {
            if(prime[i]==0) {
                count++;
            }
        }

        return count;
        
    }
}