// Last updated: 8/9/2025, 1:38:10 PM
class Solution {
    public int alternateDigitSum(int n) {
        return answer(n);
    }
    public static int answer(int n){
        List<Integer> ll = new ArrayList<>();
        while(n>0){
            ll.add(n%10);
            n = n/10;
        }
        Collections.reverse(ll);
        int sum =0;
        int s =1;
        for(int i=0;i<ll.size();i++){
            int val = ll.get(i)*s;
            sum += val;
            s = -s;
        }
        return sum;
    }
}