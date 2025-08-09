// Last updated: 8/9/2025, 1:36:32 PM
class Solution {
    public long sumOfLargestPrimes(String s) {
        return answer(s);
    }
    public static long answer(String s){
        List<Long> ll  = new ArrayList<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str = s.substring(i,j+1);
                long num = Long.parseLong(str);
                if(isPrime(num) && !ll.contains(num)){
                    ll.add(num);
                }
            }
        }
        Collections.sort(ll);
        long sum =0;
        int c =0;
        for(int j = ll.size()-1;j>=0 && c<3 ;j--){
            sum += ll.get(j);
            c++;
        }
        return sum;
    }

    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}