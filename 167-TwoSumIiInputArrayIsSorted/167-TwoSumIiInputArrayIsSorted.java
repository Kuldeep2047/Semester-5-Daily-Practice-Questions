// Last updated: 8/9/2025, 1:44:48 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return two_sum(numbers,target);
    }
    public static int[] two_sum(int[] arr,int target){
        int [] ans ={-1,-1};
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==target){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return ans;
    }
}