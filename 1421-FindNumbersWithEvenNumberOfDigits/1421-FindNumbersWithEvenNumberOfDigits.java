// Last updated: 8/9/2025, 1:40:59 PM
class Solution {
    public int findNumbers(int[] nums) {
        return even_number(nums);
    }
    public static int even_number(int[] nums){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i])){
                c++;
            }
        }
        return c;
    }
    public static boolean isEven(int n){
        int l=0;
        while(n>0){
            n=n/10;
            l++;
        }
        return l% 2==0;
    }
}