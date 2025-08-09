// Last updated: 8/9/2025, 1:38:32 PM
class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        
        return answer(nums,numsDivide);
    }
    public static int answer(int[] nums,int[] divide){
        int gcd = divide[0];
        int n = divide.length;
        for(int i=1;i<n;i++){
            gcd = GCD(gcd,divide[i]);
        }

        Arrays.sort(nums);
        // int idx =0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(gcd % nums[i]==0){
                return i;
            }
        }
        return -1;
    }

    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}