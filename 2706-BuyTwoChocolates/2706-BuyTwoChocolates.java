// Last updated: 10/1/2025, 10:37:17 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        return answer(prices, money);
    }
    public int answer(int[] arr ,int m){
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = a+b;
        if(c<=m){
            return m-c;
        }else{
            return m;
        }
    }
}