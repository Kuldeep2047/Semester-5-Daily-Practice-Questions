// Last updated: 12/17/2025, 9:22:23 PM
1class Solution {
2    public boolean divisorGame(int n) {
3        return answer(n);
4    }
5
6    public boolean answer(int n){
7        if (n % 2 == 0){
8            return true;
9        }else{
10            return false;
11        }
12    }
13}