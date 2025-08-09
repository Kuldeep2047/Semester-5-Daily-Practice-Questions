// Last updated: 8/9/2025, 1:42:04 PM
class Solution {
    public int primePalindrome(int n) {
        return Prime_Palindrome(n);
    }
    public static int Prime_Palindrome(int n){
        while(true){
            if(isPrime(n) && isPalindrome(n)){
                return n;
            }
            n=n+1;
            if (10_000_000 < n && n < 100_000_000) {
                n = 100_000_000;
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        if(n<10){
            return true;
        }
        String str = String.valueOf(n);;
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}