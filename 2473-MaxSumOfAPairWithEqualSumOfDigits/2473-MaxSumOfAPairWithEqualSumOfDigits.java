// Last updated: 8/9/2025, 1:38:24 PM
class Solution {
    public int maximumSum(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] nums){
        // List<Integer> ll = new ArrayList<>();
        int ans =-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            int dsum = digit_sum(n);
            if(map.containsKey(dsum)){
                int preMax = map.get(dsum);
                ans = Math.max(preMax+n,ans);
                map.put(dsum,Math.max(n,preMax));
                
            }else{
                map.put(dsum,n);
            }
        }
        return ans;

    }
    public static int digit_sum(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum += r;
            n = n/10;
        }
        return sum;
    }
}