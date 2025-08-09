// Last updated: 8/9/2025, 1:39:21 PM
class Solution {
    public int getLucky(String s, int k) {
        return answer(s,k);
    }
    public static int answer(String s,int k){
        int n = s.length();
        int sum = 0;
        
        for (char i : s.toCharArray()) {
            int value = i - 'a' +1; 
            while (value  >0) {
                sum += value % 10; 
                value /= 10;
            }
        }

        
        while (k-- > 1) {  
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10; 
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }
}