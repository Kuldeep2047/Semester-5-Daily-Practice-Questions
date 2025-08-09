// Last updated: 8/9/2025, 1:37:43 PM
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        return Prime_Pairs(n);
    }
    public static List<List<Integer>> Prime_Pairs(int n){
        List<List<Integer>> l = new ArrayList<>();
        boolean[] isPrime = sieveOfEratosthenes(n);
        for(int i=2;i<=n/2;i++){
            
            if(isPrime[i] && isPrime[n-i]){
                List<Integer> r = new ArrayList<>();
                r.add(i);
                r.add(n-i);
                l.add(r);
            }
    
        }
        return l;
    }
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}