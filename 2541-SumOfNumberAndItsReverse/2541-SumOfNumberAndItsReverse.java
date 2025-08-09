// Last updated: 8/9/2025, 1:38:17 PM
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        return answer(num);
    }
    public static boolean answer(int num){
        int i=0;
        while(i<=num){
            String a = Integer.toString(i);
            int first = Integer.parseInt(a);
            String b  = new StringBuilder(a).reverse().toString();
            int second = Integer.parseInt(b);
            if(first+second==num){
                return true;
            }
            i++;
        }
        return false;
    }
}